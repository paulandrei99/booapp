import axios from "axios";

const USERS_REST_API_URL = "http://localhost:8080/user/getAllUsers";

class UserService {
  getUsers() {
    return axios.get(USERS_REST_API_URL, {
      headers: {
        Accept: "application/json",
        "Content-Type": "application/json",
        "Access-Control-Allow-Origin": "*",
      },
    });
  }
}

export default new UserService();
