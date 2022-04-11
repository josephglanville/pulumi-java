// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebasehosting_v1beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SiteArgs extends io.pulumi.resources.ResourceArgs {

    public static final SiteArgs Empty = new SiteArgs();

    /**
     * Optional. The [ID of a Web App](https://firebase.google.com/docs/projects/api/reference/rest/v1beta1/projects.webApps#WebApp.FIELDS.app_id) associated with the Hosting site.
     * 
     */
    @Import(name="appId")
      private final @Nullable Output<String> appId;

    public Output<String> getAppId() {
        return this.appId == null ? Codegen.empty() : this.appId;
    }

    /**
     * Optional. User-specified labels for the Hosting site.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="siteId", required=true)
      private final Output<String> siteId;

    public Output<String> getSiteId() {
        return this.siteId;
    }

    public SiteArgs(
        @Nullable Output<String> appId,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> project,
        Output<String> siteId) {
        this.appId = appId;
        this.labels = labels;
        this.project = project;
        this.siteId = Objects.requireNonNull(siteId, "expected parameter 'siteId' to be non-null");
    }

    private SiteArgs() {
        this.appId = Codegen.empty();
        this.labels = Codegen.empty();
        this.project = Codegen.empty();
        this.siteId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SiteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> appId;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> project;
        private Output<String> siteId;

        public Builder() {
    	      // Empty
        }

        public Builder(SiteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.labels = defaults.labels;
    	      this.project = defaults.project;
    	      this.siteId = defaults.siteId;
        }

        public Builder appId(@Nullable Output<String> appId) {
            this.appId = appId;
            return this;
        }
        public Builder appId(@Nullable String appId) {
            this.appId = Codegen.ofNullable(appId);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder siteId(Output<String> siteId) {
            this.siteId = Objects.requireNonNull(siteId);
            return this;
        }
        public Builder siteId(String siteId) {
            this.siteId = Output.of(Objects.requireNonNull(siteId));
            return this;
        }        public SiteArgs build() {
            return new SiteArgs(appId, labels, project, siteId);
        }
    }
}
