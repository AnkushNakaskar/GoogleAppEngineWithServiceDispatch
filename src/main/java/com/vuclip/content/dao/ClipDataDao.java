package com.vuclip.content.dao;

import org.springframework.stereotype.Component;

@Component
public class ClipDataDao {

//	@Autowired
//	private EntityClipDataConvertor entityToClipDataConvertor;
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
//		clipKeyFactory = clipKeyFactory.setKind("clipentity");
//	}
//
//	
//	public ClipEntity getClipData(Long id) {
//		Key key = clipKeyFactory.newKey(id);
//		Entity entity = dataStore.get(key);
//		ClipEntity clipData = entityToClipDataConvertor.convert(entity);
//		return clipData;
//
//	}
//	
//	public Entity createEntity(ClipEntity clipEntity) {
//		 Entity entity = createClipEntity(clipEntity);
//		 Entity add = dataStore.add(entity);
//		 Long id = add.getKey().getId();
//		 System.out.println(id);
//		return add;
//	}
//
//
//	private  Entity createClipEntity(ClipEntity clipEntity) {
//		  Key key = clipKeyFactory.newKey(clipEntity.getId());
//		  java.sql.Timestamp timestamp =new java.sql.Timestamp(System.currentTimeMillis());
//		  com.google.protobuf.Timestamp time = com.google.protobuf.Timestamp.newBuilder().setSeconds(timestamp.getTime()/1000).setNanos(timestamp.getNanos()).build();
//		  Timestamp.fromProto(time);
//		return Entity.newBuilder(key).
//				set("productType", clipEntity.getProductType())
//				.set("shortTitle", clipEntity.getShortTitle()).
//				 set("timestamp",Timestamp.fromProto(time)).
//				 set("createtime",Timestamp.fromProto(time)).
//				build();
//	}

}
