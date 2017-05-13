/*
 * Copyright 2017 Hippo Seven
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hippo.ehviewer.scene.gallerylist;

/*
 * Created by Hippo on 5/12/2017.
 */

import android.support.annotation.NonNull;
import com.hippo.ehviewer.client.GLUrlBuilder;
import com.hippo.ehviewer.scene.EhvScene;

public class GalleryListScene extends EhvScene<GalleryListPresenter, GalleryListView> {

  @NonNull
  @Override
  protected GalleryListPresenter createPresenter() {
    return new GalleryListPresenter();
  }

  @NonNull
  @Override
  protected GalleryListView createView() {
    return new GalleryListView();
  }

  public void applyGLUrlBuilder(@NonNull GLUrlBuilder builder) {
    GalleryListPresenter presenter = getPresenter();
    if (presenter != null) {
      presenter.applyGLUrlBuilder(builder);
    }
  }
}
