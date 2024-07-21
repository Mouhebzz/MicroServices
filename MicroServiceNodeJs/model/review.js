const mongoose = require("mongoose");

const reviewSchema = new mongoose.Schema(
  {
    rating: { type: Number, required: true },
    feedback: { type: String, required: true },
  },
  {
    timestamps: true,
  }
);

const Review = mongoose.model("Review", reviewSchema);

module.exports = Review;
