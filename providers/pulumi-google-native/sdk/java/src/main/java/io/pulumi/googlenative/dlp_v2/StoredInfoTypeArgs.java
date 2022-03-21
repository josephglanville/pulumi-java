// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2StoredInfoTypeConfigArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StoredInfoTypeArgs extends io.pulumi.resources.ResourceArgs {

    public static final StoredInfoTypeArgs Empty = new StoredInfoTypeArgs();

    /**
     * Configuration of the storedInfoType to create.
     * 
     */
    @Import(name="config", required=true)
      private final Output<GooglePrivacyDlpV2StoredInfoTypeConfigArgs> config;

    public Output<GooglePrivacyDlpV2StoredInfoTypeConfigArgs> getConfig() {
        return this.config;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The storedInfoType ID can contain uppercase and lowercase letters, numbers, and hyphens; that is, it must match the regular expression: `[a-zA-Z\d-_]+`. The maximum length is 100 characters. Can be empty to allow the system to generate one.
     * 
     */
    @Import(name="storedInfoTypeId")
      private final @Nullable Output<String> storedInfoTypeId;

    public Output<String> getStoredInfoTypeId() {
        return this.storedInfoTypeId == null ? Output.empty() : this.storedInfoTypeId;
    }

    public StoredInfoTypeArgs(
        Output<GooglePrivacyDlpV2StoredInfoTypeConfigArgs> config,
        @Nullable Output<String> location,
        @Nullable Output<String> project,
        @Nullable Output<String> storedInfoTypeId) {
        this.config = Objects.requireNonNull(config, "expected parameter 'config' to be non-null");
        this.location = location;
        this.project = project;
        this.storedInfoTypeId = storedInfoTypeId;
    }

    private StoredInfoTypeArgs() {
        this.config = Output.empty();
        this.location = Output.empty();
        this.project = Output.empty();
        this.storedInfoTypeId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StoredInfoTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<GooglePrivacyDlpV2StoredInfoTypeConfigArgs> config;
        private @Nullable Output<String> location;
        private @Nullable Output<String> project;
        private @Nullable Output<String> storedInfoTypeId;

        public Builder() {
    	      // Empty
        }

        public Builder(StoredInfoTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.storedInfoTypeId = defaults.storedInfoTypeId;
        }

        public Builder config(Output<GooglePrivacyDlpV2StoredInfoTypeConfigArgs> config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }
        public Builder config(GooglePrivacyDlpV2StoredInfoTypeConfigArgs config) {
            this.config = Output.of(Objects.requireNonNull(config));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder storedInfoTypeId(@Nullable Output<String> storedInfoTypeId) {
            this.storedInfoTypeId = storedInfoTypeId;
            return this;
        }
        public Builder storedInfoTypeId(@Nullable String storedInfoTypeId) {
            this.storedInfoTypeId = Output.ofNullable(storedInfoTypeId);
            return this;
        }        public StoredInfoTypeArgs build() {
            return new StoredInfoTypeArgs(config, location, project, storedInfoTypeId);
        }
    }
}
