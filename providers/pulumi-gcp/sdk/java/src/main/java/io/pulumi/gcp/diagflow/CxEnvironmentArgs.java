// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.diagflow.inputs.CxEnvironmentVersionConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxEnvironmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxEnvironmentArgs Empty = new CxEnvironmentArgs();

    /**
     * The human-readable description of the environment. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The human-readable name of the environment (unique in an agent). Limit of 64 characters.
     * 
     */
    @InputImport(name="displayName", required=true)
      private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * The Agent to create an Environment for.
     * Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>.
     * 
     */
    @InputImport(name="parent")
      private final @Nullable Input<String> parent;

    public Input<String> getParent() {
        return this.parent == null ? Input.empty() : this.parent;
    }

    /**
     * A list of configurations for flow versions. You should include version configs for all flows that are reachable from [Start Flow][Agent.start_flow] in the agent. Otherwise, an error will be returned.
     * Structure is documented below.
     * 
     */
    @InputImport(name="versionConfigs", required=true)
      private final Input<List<CxEnvironmentVersionConfigArgs>> versionConfigs;

    public Input<List<CxEnvironmentVersionConfigArgs>> getVersionConfigs() {
        return this.versionConfigs;
    }

    public CxEnvironmentArgs(
        @Nullable Input<String> description,
        Input<String> displayName,
        @Nullable Input<String> parent,
        Input<List<CxEnvironmentVersionConfigArgs>> versionConfigs) {
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.parent = parent;
        this.versionConfigs = Objects.requireNonNull(versionConfigs, "expected parameter 'versionConfigs' to be non-null");
    }

    private CxEnvironmentArgs() {
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.parent = Input.empty();
        this.versionConfigs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<String> displayName;
        private @Nullable Input<String> parent;
        private Input<List<CxEnvironmentVersionConfigArgs>> versionConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(CxEnvironmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.parent = defaults.parent;
    	      this.versionConfigs = defaults.versionConfigs;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder setParent(@Nullable Input<String> parent) {
            this.parent = parent;
            return this;
        }

        public Builder setParent(@Nullable String parent) {
            this.parent = Input.ofNullable(parent);
            return this;
        }

        public Builder setVersionConfigs(Input<List<CxEnvironmentVersionConfigArgs>> versionConfigs) {
            this.versionConfigs = Objects.requireNonNull(versionConfigs);
            return this;
        }

        public Builder setVersionConfigs(List<CxEnvironmentVersionConfigArgs> versionConfigs) {
            this.versionConfigs = Input.of(Objects.requireNonNull(versionConfigs));
            return this;
        }
        public CxEnvironmentArgs build() {
            return new CxEnvironmentArgs(description, displayName, parent, versionConfigs);
        }
    }
}
