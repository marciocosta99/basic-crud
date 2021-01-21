import { UsersServiceService } from './../users-service/users-service.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {

  users: any;

  constructor(private usersService: UsersServiceService) { }

  ngOnInit(): void {
    this.usersService.getUsers().subscribe(users => {
      this.users = users["content"];
      console.log(users);
    })
  }

}
