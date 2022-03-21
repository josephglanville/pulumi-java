// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetIntentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetIntentArgs Empty = new GetIntentArgs();

    @Import(name="intentId", required=true)
      private final String intentId;

    public String getIntentId() {
        return this.intentId;
    }

    @Import(name="intentView")
      private final @Nullable String intentView;

    public Optional<String> getIntentView() {
        return this.intentView == null ? Optional.empty() : Optional.ofNullable(this.intentView);
    }

    @Import(name="languageCode")
      private final @Nullable String languageCode;

    public Optional<String> getLanguageCode() {
        return this.languageCode == null ? Optional.empty() : Optional.ofNullable(this.languageCode);
    }

    @Import(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetIntentArgs(
        String intentId,
        @Nullable String intentView,
        @Nullable String languageCode,
        String location,
        @Nullable String project) {
        this.intentId = Objects.requireNonNull(intentId, "expected parameter 'intentId' to be non-null");
        this.intentView = intentView;
        this.languageCode = languageCode;
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
    }

    private GetIntentArgs() {
        this.intentId = null;
        this.intentView = null;
        this.languageCode = null;
        this.location = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIntentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String intentId;
        private @Nullable String intentView;
        private @Nullable String languageCode;
        private String location;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIntentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.intentId = defaults.intentId;
    	      this.intentView = defaults.intentView;
    	      this.languageCode = defaults.languageCode;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder intentId(String intentId) {
            this.intentId = Objects.requireNonNull(intentId);
            return this;
        }
        public Builder intentView(@Nullable String intentView) {
            this.intentView = intentView;
            return this;
        }
        public Builder languageCode(@Nullable String languageCode) {
            this.languageCode = languageCode;
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }        public GetIntentArgs build() {
            return new GetIntentArgs(intentId, intentView, languageCode, location, project);
        }
    }
}
