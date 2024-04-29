package com.ty.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Borrow {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long borrowId;

	private Long memberId;
	private Long bookId;
	private LocalDate borrowedDate;
	private LocalDate dueDate;
}
