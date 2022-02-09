// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.azurenative.containerregistry.outputs.DockerBuildRequestResponse;
import io.pulumi.azurenative.containerregistry.outputs.EncodedTaskRunRequestResponse;
import io.pulumi.azurenative.containerregistry.outputs.FileTaskRunRequestResponse;
import io.pulumi.azurenative.containerregistry.outputs.IdentityPropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.RunResponse;
import io.pulumi.azurenative.containerregistry.outputs.SystemDataResponse;
import io.pulumi.azurenative.containerregistry.outputs.TaskRunRequestResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListTaskRunDetailsResult {
    private final @Nullable String forceUpdateTag;
    private final String id;
    private final @Nullable IdentityPropertiesResponse identity;
    private final @Nullable String location;
    private final String name;
    private final String provisioningState;
    private final @Nullable Object runRequest;
    private final RunResponse runResult;
    private final SystemDataResponse systemData;
    private final String type;

    @OutputCustomType.Constructor({"forceUpdateTag","id","identity","location","name","provisioningState","runRequest","runResult","systemData","type"})
    private ListTaskRunDetailsResult(
        @Nullable String forceUpdateTag,
        String id,
        @Nullable IdentityPropertiesResponse identity,
        @Nullable String location,
        String name,
        String provisioningState,
        @Nullable Object runRequest,
        RunResponse runResult,
        SystemDataResponse systemData,
        String type) {
        this.forceUpdateTag = forceUpdateTag;
        this.id = Objects.requireNonNull(id);
        this.identity = identity;
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.runRequest = runRequest;
        this.runResult = Objects.requireNonNull(runResult);
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    public Optional<String> getForceUpdateTag() {
        return Optional.ofNullable(this.forceUpdateTag);
    }
    public String getId() {
        return this.id;
    }
    public Optional<IdentityPropertiesResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    public String getName() {
        return this.name;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public Optional<Object> getRunRequest() {
        return Optional.ofNullable(this.runRequest);
    }
    public RunResponse getRunResult() {
        return this.runResult;
    }
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListTaskRunDetailsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String forceUpdateTag;
        private String id;
        private @Nullable IdentityPropertiesResponse identity;
        private @Nullable String location;
        private String name;
        private String provisioningState;
        private @Nullable Object runRequest;
        private RunResponse runResult;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ListTaskRunDetailsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forceUpdateTag = defaults.forceUpdateTag;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.runRequest = defaults.runRequest;
    	      this.runResult = defaults.runResult;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setForceUpdateTag(@Nullable String forceUpdateTag) {
            this.forceUpdateTag = forceUpdateTag;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(@Nullable IdentityPropertiesResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRunRequest(@Nullable Object runRequest) {
            this.runRequest = runRequest;
            return this;
        }

        public Builder setRunResult(RunResponse runResult) {
            this.runResult = Objects.requireNonNull(runResult);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public ListTaskRunDetailsResult build() {
            return new ListTaskRunDetailsResult(forceUpdateTag, id, identity, location, name, provisioningState, runRequest, runResult, systemData, type);
        }
    }
}
