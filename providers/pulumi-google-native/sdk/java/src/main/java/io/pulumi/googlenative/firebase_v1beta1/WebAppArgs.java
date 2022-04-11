// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebase_v1beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAppArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAppArgs Empty = new WebAppArgs();

    /**
     * Immutable. The globally unique, Firebase-assigned identifier for the `WebApp`. This identifier should be treated as an opaque token, as the data format is not specified.
     * 
     */
    @Import(name="appId")
      private final @Nullable Output<String> appId;

    public Output<String> getAppId() {
        return this.appId == null ? Codegen.empty() : this.appId;
    }

    /**
     * The URLs where the `WebApp` is hosted.
     * 
     */
    @Import(name="appUrls")
      private final @Nullable Output<List<String>> appUrls;

    public Output<List<String>> getAppUrls() {
        return this.appUrls == null ? Codegen.empty() : this.appUrls;
    }

    /**
     * The user-assigned display name for the `WebApp`.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * The resource name of the WebApp, in the format: projects/PROJECT_IDENTIFIER /webApps/APP_ID * PROJECT_IDENTIFIER: the parent Project's [`ProjectNumber`](../projects#FirebaseProject.FIELDS.project_number) ***(recommended)*** or its [`ProjectId`](../projects#FirebaseProject.FIELDS.project_id). Learn more about using project identifiers in Google's [AIP 2510 standard](https://google.aip.dev/cloud/2510). Note that the value for PROJECT_IDENTIFIER in any response body will be the `ProjectId`. * APP_ID: the globally unique, Firebase-assigned identifier for the App (see [`appId`](../projects.webApps#WebApp.FIELDS.app_id)).
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Immutable. A user-assigned unique identifier of the parent FirebaseProject for the `WebApp`.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    public WebAppArgs(
        @Nullable Output<String> appId,
        @Nullable Output<List<String>> appUrls,
        @Nullable Output<String> displayName,
        @Nullable Output<String> name,
        @Nullable Output<String> project) {
        this.appId = appId;
        this.appUrls = appUrls;
        this.displayName = displayName;
        this.name = name;
        this.project = project;
    }

    private WebAppArgs() {
        this.appId = Codegen.empty();
        this.appUrls = Codegen.empty();
        this.displayName = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAppArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> appId;
        private @Nullable Output<List<String>> appUrls;
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAppArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.appUrls = defaults.appUrls;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
        }

        public Builder appId(@Nullable Output<String> appId) {
            this.appId = appId;
            return this;
        }
        public Builder appId(@Nullable String appId) {
            this.appId = Codegen.ofNullable(appId);
            return this;
        }
        public Builder appUrls(@Nullable Output<List<String>> appUrls) {
            this.appUrls = appUrls;
            return this;
        }
        public Builder appUrls(@Nullable List<String> appUrls) {
            this.appUrls = Codegen.ofNullable(appUrls);
            return this;
        }
        public Builder appUrls(String... appUrls) {
            return appUrls(List.of(appUrls));
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }        public WebAppArgs build() {
            return new WebAppArgs(appId, appUrls, displayName, name, project);
        }
    }
}
