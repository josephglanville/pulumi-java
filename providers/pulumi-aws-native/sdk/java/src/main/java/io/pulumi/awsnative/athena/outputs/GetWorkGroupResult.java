// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.athena.outputs;

import io.pulumi.awsnative.athena.enums.WorkGroupState;
import io.pulumi.awsnative.athena.outputs.WorkGroupConfiguration;
import io.pulumi.awsnative.athena.outputs.WorkGroupConfigurationUpdates;
import io.pulumi.awsnative.athena.outputs.WorkGroupTag;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWorkGroupResult {
    /**
     * The date and time the workgroup was created.
     * 
     */
    private final @Nullable String creationTime;
    /**
     * The workgroup description.
     * 
     */
    private final @Nullable String description;
    /**
     * The option to delete the workgroup and its contents even if the workgroup contains any named queries.
     * 
     */
    private final @Nullable Boolean recursiveDeleteOption;
    /**
     * The state of the workgroup: ENABLED or DISABLED.
     * 
     */
    private final @Nullable WorkGroupState state;
    /**
     * One or more tags, separated by commas, that you want to attach to the workgroup as you create it
     * 
     */
    private final @Nullable List<WorkGroupTag> tags;
    /**
     * The workgroup configuration
     * 
     */
    private final @Nullable WorkGroupConfiguration workGroupConfiguration;
    /**
     * The workgroup configuration update object
     * 
     */
    private final @Nullable WorkGroupConfigurationUpdates workGroupConfigurationUpdates;

    @CustomType.Constructor
    private GetWorkGroupResult(
        @CustomType.Parameter("creationTime") @Nullable String creationTime,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("recursiveDeleteOption") @Nullable Boolean recursiveDeleteOption,
        @CustomType.Parameter("state") @Nullable WorkGroupState state,
        @CustomType.Parameter("tags") @Nullable List<WorkGroupTag> tags,
        @CustomType.Parameter("workGroupConfiguration") @Nullable WorkGroupConfiguration workGroupConfiguration,
        @CustomType.Parameter("workGroupConfigurationUpdates") @Nullable WorkGroupConfigurationUpdates workGroupConfigurationUpdates) {
        this.creationTime = creationTime;
        this.description = description;
        this.recursiveDeleteOption = recursiveDeleteOption;
        this.state = state;
        this.tags = tags;
        this.workGroupConfiguration = workGroupConfiguration;
        this.workGroupConfigurationUpdates = workGroupConfigurationUpdates;
    }

    /**
     * The date and time the workgroup was created.
     * 
    */
    public Optional<String> getCreationTime() {
        return Optional.ofNullable(this.creationTime);
    }
    /**
     * The workgroup description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The option to delete the workgroup and its contents even if the workgroup contains any named queries.
     * 
    */
    public Optional<Boolean> getRecursiveDeleteOption() {
        return Optional.ofNullable(this.recursiveDeleteOption);
    }
    /**
     * The state of the workgroup: ENABLED or DISABLED.
     * 
    */
    public Optional<WorkGroupState> getState() {
        return Optional.ofNullable(this.state);
    }
    /**
     * One or more tags, separated by commas, that you want to attach to the workgroup as you create it
     * 
    */
    public List<WorkGroupTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * The workgroup configuration
     * 
    */
    public Optional<WorkGroupConfiguration> getWorkGroupConfiguration() {
        return Optional.ofNullable(this.workGroupConfiguration);
    }
    /**
     * The workgroup configuration update object
     * 
    */
    public Optional<WorkGroupConfigurationUpdates> getWorkGroupConfigurationUpdates() {
        return Optional.ofNullable(this.workGroupConfigurationUpdates);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String creationTime;
        private @Nullable String description;
        private @Nullable Boolean recursiveDeleteOption;
        private @Nullable WorkGroupState state;
        private @Nullable List<WorkGroupTag> tags;
        private @Nullable WorkGroupConfiguration workGroupConfiguration;
        private @Nullable WorkGroupConfigurationUpdates workGroupConfigurationUpdates;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.description = defaults.description;
    	      this.recursiveDeleteOption = defaults.recursiveDeleteOption;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.workGroupConfiguration = defaults.workGroupConfiguration;
    	      this.workGroupConfigurationUpdates = defaults.workGroupConfigurationUpdates;
        }

        public Builder creationTime(@Nullable String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder recursiveDeleteOption(@Nullable Boolean recursiveDeleteOption) {
            this.recursiveDeleteOption = recursiveDeleteOption;
            return this;
        }
        public Builder state(@Nullable WorkGroupState state) {
            this.state = state;
            return this;
        }
        public Builder tags(@Nullable List<WorkGroupTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(WorkGroupTag... tags) {
            return tags(List.of(tags));
        }
        public Builder workGroupConfiguration(@Nullable WorkGroupConfiguration workGroupConfiguration) {
            this.workGroupConfiguration = workGroupConfiguration;
            return this;
        }
        public Builder workGroupConfigurationUpdates(@Nullable WorkGroupConfigurationUpdates workGroupConfigurationUpdates) {
            this.workGroupConfigurationUpdates = workGroupConfigurationUpdates;
            return this;
        }        public GetWorkGroupResult build() {
            return new GetWorkGroupResult(creationTime, description, recursiveDeleteOption, state, tags, workGroupConfiguration, workGroupConfigurationUpdates);
        }
    }
}
