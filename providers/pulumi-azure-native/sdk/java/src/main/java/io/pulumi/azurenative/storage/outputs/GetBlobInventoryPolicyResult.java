// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.azurenative.storage.outputs.BlobInventoryPolicySchemaResponse;
import io.pulumi.azurenative.storage.outputs.SystemDataResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetBlobInventoryPolicyResult {
    private final String id;
    private final String lastModifiedTime;
    private final String name;
    private final BlobInventoryPolicySchemaResponse policy;
    private final SystemDataResponse systemData;
    private final String type;

    @OutputCustomType.Constructor({"id","lastModifiedTime","name","policy","systemData","type"})
    private GetBlobInventoryPolicyResult(
        String id,
        String lastModifiedTime,
        String name,
        BlobInventoryPolicySchemaResponse policy,
        SystemDataResponse systemData,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime);
        this.name = Objects.requireNonNull(name);
        this.policy = Objects.requireNonNull(policy);
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    public String getId() {
        return this.id;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    public String getName() {
        return this.name;
    }
    public BlobInventoryPolicySchemaResponse getPolicy() {
        return this.policy;
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

    public static Builder builder(GetBlobInventoryPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String lastModifiedTime;
        private String name;
        private BlobInventoryPolicySchemaResponse policy;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBlobInventoryPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPolicy(BlobInventoryPolicySchemaResponse policy) {
            this.policy = Objects.requireNonNull(policy);
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

        public GetBlobInventoryPolicyResult build() {
            return new GetBlobInventoryPolicyResult(id, lastModifiedTime, name, policy, systemData, type);
        }
    }
}
