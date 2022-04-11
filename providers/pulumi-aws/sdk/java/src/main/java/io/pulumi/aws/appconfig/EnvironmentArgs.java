// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appconfig;

import io.pulumi.aws.appconfig.inputs.EnvironmentMonitorArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentArgs Empty = new EnvironmentArgs();

    /**
     * The AppConfig application ID. Must be between 4 and 7 characters in length.
     * 
     */
    @Import(name="applicationId", required=true)
      private final Output<String> applicationId;

    public Output<String> getApplicationId() {
        return this.applicationId;
    }

    /**
     * The description of the environment. Can be at most 1024 characters.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Set of Amazon CloudWatch alarms to monitor during the deployment process. Maximum of 5. See Monitor below for more details.
     * 
     */
    @Import(name="monitors")
      private final @Nullable Output<List<EnvironmentMonitorArgs>> monitors;

    public Output<List<EnvironmentMonitorArgs>> getMonitors() {
        return this.monitors == null ? Codegen.empty() : this.monitors;
    }

    /**
     * The name for the environment. Must be between 1 and 64 characters in length.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public EnvironmentArgs(
        Output<String> applicationId,
        @Nullable Output<String> description,
        @Nullable Output<List<EnvironmentMonitorArgs>> monitors,
        @Nullable Output<String> name,
        @Nullable Output<Map<String,String>> tags) {
        this.applicationId = Objects.requireNonNull(applicationId, "expected parameter 'applicationId' to be non-null");
        this.description = description;
        this.monitors = monitors;
        this.name = name;
        this.tags = tags;
    }

    private EnvironmentArgs() {
        this.applicationId = Codegen.empty();
        this.description = Codegen.empty();
        this.monitors = Codegen.empty();
        this.name = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> applicationId;
        private @Nullable Output<String> description;
        private @Nullable Output<List<EnvironmentMonitorArgs>> monitors;
        private @Nullable Output<String> name;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.description = defaults.description;
    	      this.monitors = defaults.monitors;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder applicationId(Output<String> applicationId) {
            this.applicationId = Objects.requireNonNull(applicationId);
            return this;
        }
        public Builder applicationId(String applicationId) {
            this.applicationId = Output.of(Objects.requireNonNull(applicationId));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder monitors(@Nullable Output<List<EnvironmentMonitorArgs>> monitors) {
            this.monitors = monitors;
            return this;
        }
        public Builder monitors(@Nullable List<EnvironmentMonitorArgs> monitors) {
            this.monitors = Codegen.ofNullable(monitors);
            return this;
        }
        public Builder monitors(EnvironmentMonitorArgs... monitors) {
            return monitors(List.of(monitors));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public EnvironmentArgs build() {
            return new EnvironmentArgs(applicationId, description, monitors, name, tags);
        }
    }
}
