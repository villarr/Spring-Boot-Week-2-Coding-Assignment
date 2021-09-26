package com.promineotech.entity;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor()
@AllArgsConstructor()

public class Jeeps {
	
		  private Long modelPK;
		  private JeepModel modelId;
		  private String trimLevel;
		  private int numDoors;
		  private int wheelSize;
		  private BigDecimal basePrice;

		public void setModelId(JeepModel modelId) {
			this.modelId = modelId;
		}

		public void setTrimLevel(String trimLevel) {
			this.trimLevel = trimLevel;
		}

		public void setNumDoors(int numDoors) {
			this.numDoors = numDoors;
		}

		public void setWheelSize(int wheelSize) {
			this.wheelSize = wheelSize;
		}

		public void setBasePrice(BigDecimal basePrice) {
			this.basePrice = basePrice;
		}

	}

