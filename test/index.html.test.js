const { expect } = require("chai");
const fs = require("fs");
const path = require("path");

describe("my_list.html", () => {
  it("should be present", () => {
    const fileExists = fs.existsSync(
      path.resolve(__dirname, "..", "my_list.html")
    );
    const errorHint =
      "Make sure you created a file called 'my_list.html' in the lab directory with your HTML document in it!";

    expect(fileExists, errorHint).to.be.true;
  });
});
