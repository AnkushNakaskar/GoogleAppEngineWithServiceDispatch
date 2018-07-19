package com.vuclip.content.dao;

import org.springframework.stereotype.Component;

@Component
public class RightDao {

//	@Autowired
//	private EntityToRightConvertor entityToRightEntityConvertor;
//	
//	@Autowired
//	private Datastore dataStore;
//
//	private KeyFactory clipKeyFactory;
//	
//	
//
//	@PostConstruct
//	public void initializeKeyFactories() {
//		clipKeyFactory = dataStore.newKeyFactory().setNamespace("contenttest");
//		clipKeyFactory = clipKeyFactory.setKind("rightentity");
//	}
//
//	
//	public RightEntity getRightData(Long id) {
//		Key key = clipKeyFactory.newKey(id);
//		Entity entity = dataStore.get(key);
//		RightEntity rightData = entityToRightEntityConvertor.convert(entity);
//		return rightData;
//
//	}
//	
//	public Entity createRightEntity(RightEntity rightEntity) {
//		 Entity entity = createEntity(rightEntity);
//		 Entity add = dataStore.add(entity);
//		 Long id = add.getKey().getId();
//		 System.out.println(id);
//		return add;
//	}
//
//	public Entity updateRightEntity(RightEntity rightEntity) {
//		 Entity entity = createEntity(rightEntity);
//		 Entity updatedEntity = dataStore.put(entity);
//		 Long id = updatedEntity.getKey().getId();
//		 System.out.println("Updating right entity : "+id);
//		return updatedEntity;
//	}
//
//	private Entity createEntity(RightEntity rightEntity) {
//		  Key key = clipKeyFactory.newKey(rightEntity.getId());
//		  java.sql.Timestamp timestamp =new java.sql.Timestamp(System.currentTimeMillis());
//		  com.google.protobuf.Timestamp time = com.google.protobuf.Timestamp.newBuilder().setSeconds(timestamp.getTime()/1000).setNanos(timestamp.getNanos()).build();
//		  Timestamp.fromProto(time);
//		return Entity.newBuilder(key).
//				set("name", rightEntity.getName()).
//				 set("timestamp",Timestamp.fromProto(time)).
//				 set("createtime",Timestamp.fromProto(time)).
//				build();
//	}

}
