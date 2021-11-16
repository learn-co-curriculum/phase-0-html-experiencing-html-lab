const { expect } = require("chai");
const fs = require("fs")
const path = require("path");

describe("my_list.html", () => {
  it("should be present", () => {
    const fileExists = fs.existsSync(path.resolve(__dirname, "..", "my_list.html"))
    // Make sure you created a file called my_list.html with your HTML document in it!
    expect(fileExists).to.be.true
  });
});
