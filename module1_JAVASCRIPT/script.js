
document.addEventListener("DOMContentLoaded", function () {
  const form = document.getElementById("eventForm");
  const output = document.getElementById("confirmation");

  form.addEventListener("submit", function (e) {
    e.preventDefault();
    output.textContent = "✅ Thank you! Your registration has been submitted.";
    form.reset();
  });
});

// Validate phone number
function validatePhone() {
  const phone = document.getElementById("phone").value;
  console.log("Validating phone number:", phone);
  const regex = /^\d{10}$/;
  if (!regex.test(phone)) alert("Please enter a valid 10-digit phone number.");
}

// Update fee based on event type
function updateFee() {
  const type = document.getElementById("type").value;
  console.log("Event type selected:", type);
  const fees = { cleanup: 0, festival: 200, plant: 50 , fitness: 200, dance: 150, campfire: 100 };
  const fee = fees[type] || 0;
  document.getElementById("fee").textContent = "₹" + fee;
  localStorage.setItem("preferredEvent", type);
}

// Show confirmation
function showConfirmation(e) {
  e.preventDefault();
  console.log("Form submitted by user."); 
  document.getElementById("confirmation").textContent = "Registration Successful!";
}

//feedform submission
function countFeedbackChars() {
    const feedback = document.getElementById('feedbackText').value;
    console.log("Characters typed in feedback:", feedback.length);
    document.getElementById('feedbackCharCount').textContent = feedback.length;
}

function enlargeFeedbackImage() {
    const img = document.getElementById('feedbackImage');
    img.classList.toggle('enlarged');
}

function submitFeedback(event) {
    event.preventDefault();
    const feedbackText = document.getElementById('feedbackText').value.trim();
    console.log("Feedback submitted:", feedbackText);
    if (feedbackText.length === 0) {
        alert("Please enter your feedback before submitting.");
        return;
    }
    document.getElementById('feedbackConfirmation').textContent = "Thank you for your feedback!";
}

// Count characters in textarea
function countChars() {
  const text = document.getElementById("message").value;
  document.getElementById("charCount").textContent = text.length;
}

// Video ready
function videoReady() {
  document.getElementById("videoStatus").textContent = "Video ready to play.";
}

// Warn before unload
function confirmExit() {
  return "You have unsaved changes. Are you sure you want to leave?";
}

// Geolocation
function getLocation() {
  const display = document.getElementById("locationDisplay");
  if (navigator.geolocation) {
    navigator.geolocation.getCurrentPosition(
      pos => {
        display.textContent = `Latitude: ${pos.coords.latitude}, Longitude: ${pos.coords.longitude}`;
      },
      err => {
        display.textContent = `Error: ${err.message}`;
      },
      { enableHighAccuracy: true, timeout: 10000 }
    );
  } else {
    display.textContent = "Geolocation is not supported.";
  }
}


// Load preferred event
window.onload = () => {
  const preferred = localStorage.getItem("preferredEvent");
  if (preferred) document.getElementById("type").value = preferred;
};

// Clear preferences
function clearPreferences() {
  localStorage.clear();
  sessionStorage.clear();
  alert("Preferences cleared.");
}

// Attach the onbeforeunload event to warn users if they try to leave
window.addEventListener("beforeunload", function (e) {
  // Show warning only if form has data (optional enhancement)
  const form = document.getElementById("eventForm");
  if (form && (form.name.value || form.email.value || form.phone.value || form.message.value)) {
    const confirmationMessage = "You have unsaved changes. Are you sure you want to leave?";
    e.returnValue = confirmationMessage; // Gecko + Webkit, Safari, Chrome etc.
    return confirmationMessage;          // Gecko, WebKit, Chrome etc.
  }
  // Otherwise no warning
  return undefined;
});


// 1. Log welcome and alert page loaded
console.log("Welcome to the Community Portal");
window.addEventListener("load", () => alert("Page fully loaded!"));

// 2. Event details with const and let
const eventName = "Community Cleanup";
const eventDate = "2025-06-15";
let seatsAvailable = 10;
console.log(`Event: ${eventName}, Date: ${eventDate}, Seats: ${seatsAvailable}`);

// 3. Sample events list and display upcoming only
const eventsList = [
  {name: "Cleanup", date: "2025-06-15", seats: 10, category: "cleanup"},
  {name: "Festival", date: "2023-05-20", seats: 0, category: "festival"},
  {name: "Planting", date: "2025-07-10", seats: 5, category: "plant"},
];

function displayUpcomingEvents() {
  const now = new Date();
  const container = document.getElementById("eventsContainer");
  container.innerHTML = ""; // clear
  eventsList.forEach(ev => {
    const evDate = new Date(ev.date);
    if (evDate >= now && ev.seats > 0) {
      const card = document.createElement("div");
      card.textContent = `${ev.name} on ${ev.date} - Seats left: ${ev.seats}`;
      container.appendChild(card);
    }
  });
}
displayUpcomingEvents();

// 4. Reusable functions and closure for registrations
function createCategoryRegistrar(category) {
  let total = 0;
  return function register() {
    total++;
    console.log(`Registered in ${category}. Total: ${total}`);
  }
}
const registerCleanup = createCategoryRegistrar("cleanup");

// 5. Event class with prototype
class Event {
  constructor(name, date, seats) {
    this.name = name;
    this.date = date;
    this.seats = seats;
  }
}
Event.prototype.checkAvailability = function() {
  return this.seats > 0;
};
const evtObj = new Event("Dance Night", "2025-08-01", 20);
console.log(evtObj.checkAvailability());

// 6. Array methods
eventsList.push({name: "Fitness Camp", date: "2025-09-01", seats: 15, category: "fitness"});
const musicEvents = eventsList.filter(ev => ev.category === "dance");
const eventNames = eventsList.map(ev => `Workshop on ${ev.name}`);
console.log(musicEvents, eventNames);

// 7. DOM manipulation: dynamically add event cards
function renderEvents() {
  const container = document.getElementById("eventsContainer");
  container.innerHTML = "";
  eventsList.forEach(ev => {
    const card = document.createElement("div");
    card.className = "eventCard";
    card.textContent = `${ev.name} (${ev.date}) - Seats: ${ev.seats}`;
    container.appendChild(card);
  });
}
renderEvents();

// 8. Event handlers: register button and filter dropdown example
document.getElementById("eventsContainer").addEventListener("click", e => {
  if (e.target.classList.contains("registerBtn")) {
    alert("Register button clicked");
  }
});
document.getElementById("categoryFilter").addEventListener("change", e => {
  alert("Filter changed: " + e.target.value);
});
document.getElementById("searchBox").addEventListener("keydown", e => {
  console.log(`Key pressed in search: ${e.key}`);
});

// 9. Async fetch example with mock JSON (simulate with setTimeout)
async function fetchEvents() {
  try {
    document.getElementById("loadingSpinner").style.display = "block";
    // Simulate fetch delay
    await new Promise(res => setTimeout(res, 1000));
    // Simulated fetched data
    const fetchedEvents = [{name:"Yoga", date:"2025-10-01", seats:12}];
    console.log("Fetched events:", fetchedEvents);
  } catch (err) {
    console.error("Fetch error:", err);
  } finally {
    document.getElementById("loadingSpinner").style.display = "none";
  }
}
fetchEvents();

// 11. Form input capture and inline validation example
document.getElementById("eventForm").addEventListener("input", e => {
  if(e.target.name === "email" && !e.target.value.includes("@")) {
    e.target.setCustomValidity("Please enter a valid email.");
  } else {
    e.target.setCustomValidity("");
  }
});

// 12. Simulated POST request
function submitRegistration(data) {
  console.log("Submitting registration", data);
  return new Promise((resolve) => setTimeout(() => resolve("Success"), 1000));
}
document.getElementById("eventForm").addEventListener("submit", async e => {
  e.preventDefault();
  const formData = new FormData(e.target);
  const data = Object.fromEntries(formData.entries());
  const result = await submitRegistration(data);
  alert(result);
});

// 14. jQuery usage example
// $('#registerBtn').click(() => {
//   alert("Registered via jQuery!");
// });
// $('.eventCard').fadeIn();

