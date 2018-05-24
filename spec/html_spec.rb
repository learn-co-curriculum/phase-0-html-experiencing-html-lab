require_relative './spec_helper'

describe "A populated HTML file called my_list.html" do
  it 'should be present' do
    file_is_present = File.exists?("my_list.html")
    expect(file_is_present).to be_truthy, "Make sure you created a file called my_list.html with your HTML document in it!"
  end
end
