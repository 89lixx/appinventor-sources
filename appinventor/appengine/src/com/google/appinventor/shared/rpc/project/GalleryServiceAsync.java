// -*- mode: java; c-basic-offset: 2; -*-
// Copyright 2009-2011 Google, All Rights reserved
// Copyright 2011-2012 MIT, All rights reserved
// Released under the MIT License https://raw.github.com/mit-cml/app-inventor/master/mitlicense.txt

package com.google.appinventor.shared.rpc.project;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * Interface for the service providing project information. All declarations
 * in this interface are mirrored in {@link ProjectService}. For further
 * information see {@link ProjectService}.
 *
 */
public interface GalleryServiceAsync {

  /**
   * @see @link{@link GalleryService#loadGallerySettings()
   */
  void loadGallerySettings(AsyncCallback<GallerySettings> callback);

  /**
   * @see @link{@link GalleryService#publishApp(long, String, String, String, String, String)
   */
  void publishApp(long projectId, String title, String projectName, String description,
      String moreInfo, String credit, AsyncCallback<GalleryApp> callback);
   /**
   * @see @link{@link GalleryService#updateApp(GalleryApp, boolean)
   */
  void updateApp(GalleryApp app, boolean newImage, AsyncCallback<Void> callback);

  /**
   * @see @link{@link GalleryService#updateAppMetadata(GalleryApp)
   */
  void updateAppMetadata(GalleryApp app, AsyncCallback<Void> callback);

  /**
   * @see @link{@link GalleryService#updateAppSource(long, long, String)
   */
  void updateAppSource(long galleryId, long projectId, String projectName,
      AsyncCallback<Void> callback);

   /**
   * @see @link{@link GalleryService#indexAll(int)
   */
  void indexAll(int count,
      AsyncCallback<Void> callback);

  /**
   * @see @link{@link GalleryService#deleteApp(long)
   */
  void deleteApp(long galleryId, AsyncCallback<java.lang.Void> arg2);

  /**
   * @see @link{@link GalleryService#appWasDownloaded(long)
   */
  void appWasDownloaded(long galleryId, AsyncCallback<java.lang.Void> arg2);

  /**
   * @see @link{@link GalleryService#getNumApps()
   */
  void getNumApps(AsyncCallback<Integer> callback);
  /**
   * @see @link{@link GalleryService#getRecentApps(int, int)
   */
  void getRecentApps(int start, int count, AsyncCallback<GalleryAppListResult> callback);

  /**
   * @see @link{@link GalleryService#getFeaturedApp(int, int)
   */
  void getFeaturedApp(int start, int count, AsyncCallback<GalleryAppListResult> callback);

  /**
   * @see @link{@link GalleryService#isFeatured(long)
   */
  void isFeatured(long galleryId, AsyncCallback<Boolean> callback);

  /**
   * @see @link{@link GalleryService#markReportAsResolved(long, long)
   */
  void markAppAsFeatured(long galleryId, AsyncCallback<Boolean> callback);

   /**
   * @see @link{@link GalleryService#getMostDownloadedApps(int, int)
   */
  void getMostDownloadedApps(int start, int count, AsyncCallback<GalleryAppListResult> callback);

  /**
   * @see @link{@link GalleryService#getDeveloperApps(String, int, int)
   */
  void getDeveloperApps(String userId, int start, int count, AsyncCallback<GalleryAppListResult> callback);

  /**
   * @see @link{@link GalleryService#findApps(String, int, int)
   */
  void findApps(String keywords, int start, int count, AsyncCallback<GalleryAppListResult> callback);

   /**
   * @see @link{@link GalleryService#getApp(long)
   */
  void getApp(long galleryId, AsyncCallback<GalleryApp> callback);

  /**
   * @see @link{@link GalleryService#getComments(long)
   */
  void getComments(long galleryId, AsyncCallback<List<GalleryComment>> callback);
  /**
   * @see @link{@link GalleryService#publishApp(long, String, String, String, String, String)
   */
  void publishComment(long galleryId, String comment, AsyncCallback<java.lang.Long> date);

  /**
   * @see @link{@link GalleryService#increaseLikes(long)
   */
  void increaseLikes(long galleryId, AsyncCallback<java.lang.Integer> num);

  /**
   * @see @link{@link GalleryService#decreaseLikes(long)
   */
  void decreaseLikes(long galleryId, AsyncCallback<java.lang.Integer> num);

  /**
   * @see @link{@link GalleryService#getNumLikes(long)
   */
  void getNumLikes(long galleryId, AsyncCallback<java.lang.Integer> num);

  /**
   * @see @link{@link GalleryService#isLikedByUser(long)
   */
  void isLikedByUser(long galleryId, AsyncCallback<java.lang.Boolean> bool);

  /**
   * @see @link{@link GalleryService#addAppReport(GalleryApp, String)
   */
  void addAppReport(GalleryApp app, String reportText, AsyncCallback<java.lang.Long> date);

  /**
   * @see @link{@link GalleryService#getRecentReports(int, int)
   */
  void getRecentReports(int start, int count, AsyncCallback<List<GalleryAppReport>> callback);
  /**
   * @see @link{@link GalleryService#getAllAppReports(int, int)
   */
  void getAllAppReports(int start, int count, AsyncCallback<List<GalleryAppReport>> callback);

  /**
   * @see @link{@link GalleryService#isReportedByUser(long)
   */
  void isReportedByUser(long galleryId, AsyncCallback<java.lang.Boolean> bool);
  /**
   * @see @link{@link GalleryService#saveAttribution(long, long)
   */
  void saveAttribution(long galleryId, long attributionId, AsyncCallback<java.lang.Long> id);

  /**
   * @see @link{@link GalleryService#remixedFrom(long)
   */
  void remixedFrom(long galleryId, AsyncCallback<java.lang.Long> id);

  /**
   * @see @link{@link GalleryService#remixedTo(long)
   */
  void remixedTo(long galleryId, AsyncCallback<List<GalleryApp>> apps);
  /**
   * @see @link{@link GalleryService#markReportAsResolved(long, long)
   */
  void markReportAsResolved(long reportId, long galleryId, AsyncCallback<Boolean> callback);
  /**
   * @see @link{@link GalleryService#isGalleryAppActivated(long)
   */
  void isGalleryAppActivated(long galleryId, AsyncCallback<Boolean> callback);

  /**
   * @see @link{@link GalleryService#deactivateGalleryApp(long)
   */
  void deactivateGalleryApp(long galleryId, AsyncCallback<Boolean> callback);

  /**
   * @see @link{@link GalleryService#sendMessageFromSystem(String, String, String)
   */
  void sendMessageFromSystem(String senderId, String receiverId, String message, AsyncCallback<Long> callback);
  /**
   * @see @link{@link GalleryService#getMessages(String)
   */
  void getMessages(String receiverId, AsyncCallback<List<Message>> callback);
  /**
   * @see @link{@link GalleryService#getMessage(long)
   */
  void getMessage(long msgId, AsyncCallback<Message> callback);
  /**
   * @see @link{@link GalleryService#deleteMessage(long)
   */
  void deleteMessage(long msgId, AsyncCallback<Void> callback);
  /**
   * @see @link{@link GalleryService#readMessage(long)
   */
  void readMessage(long msgId, AsyncCallback<Void> callback);
  /**
   * @see @link{@link GalleryService#appStatsWasRead(long)
   */
  void appStatsWasRead(long appId, AsyncCallback<Void> callback);

  /**
   * see {@link GalleryService#storeModerationAction(long, long, long, String, int)}
   */
  void storeModerationAction(long reportId, long galleryId, long messageId, String moderatorId, int actionType, String moderatorName, String messagePreview, AsyncCallback<Void> callback);

  /**
   * see @link {@link GalleryService#getModerationActions(long)}
   * @param reportId
   * @return
   */
  void getModerationActions(long reportId, AsyncCallback<List<GalleryModerationAction>> callback);
}
