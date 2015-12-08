package com.cogaip.bo;

import java.util.List;

import com.cogaip.model.DefaulterTO;

public interface Defaulter {
	// TODO method prototypes of DefaulterBO class.
	public List<DefaulterTO> selectAllAutoDefaulters();
	public List<DefaulterTO> selectAllManualDefaulters();
	public List<DefaulterTO> selectAllRedefaulters();
	
	public int updateDefaultStatusByUserId(int userId);
}
