import React, { Component } from "react";

class UserComponent extends Component {
  state = {
    isLoading: true,
    Categories: [],
  };

  async componentDidMount() {
    const response = await fetch("/user/getAllUsers");
    const body = await response.json();
    this.setState({ Categories: body, isLoading: false });
  }

  render() {
    const { Categories, isLoading } = this.state;
    if (isLoading) return <div>Loading...</div>;

    return (
      <div>
        <h1> Users List</h1>
        <table class="table table-striped">
          <thead>
            <tr>
              <th scope="col">ID</th>
              <th scope="col">First Name</th>
              <th scope="col">Last Name</th>
              <th scope="col">Phone Nr</th>
            </tr>
          </thead>
          <tbody>
            {Categories.map((category) => (
              <tr>
                <th scope="row">{category.id}</th>
                <td>{category.firstName}</td>
                <td>{category.lastName}</td>
                <td>{category.phone} </td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    );
  }
}

export default UserComponent;
