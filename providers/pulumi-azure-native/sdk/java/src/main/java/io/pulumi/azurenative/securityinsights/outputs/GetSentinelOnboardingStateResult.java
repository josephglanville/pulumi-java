// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.azurenative.securityinsights.outputs.SystemDataResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetSentinelOnboardingStateResult {
    private final @Nullable Boolean customerManagedKey;
    private final @Nullable String etag;
    private final String id;
    private final String name;
    private final SystemDataResponse systemData;
    private final String type;

    @OutputCustomType.Constructor({"customerManagedKey","etag","id","name","systemData","type"})
    private GetSentinelOnboardingStateResult(
        @Nullable Boolean customerManagedKey,
        @Nullable String etag,
        String id,
        String name,
        SystemDataResponse systemData,
        String type) {
        this.customerManagedKey = customerManagedKey;
        this.etag = etag;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    public Optional<Boolean> getCustomerManagedKey() {
        return Optional.ofNullable(this.customerManagedKey);
    }
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
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

    public static Builder builder(GetSentinelOnboardingStateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean customerManagedKey;
        private @Nullable String etag;
        private String id;
        private String name;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSentinelOnboardingStateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customerManagedKey = defaults.customerManagedKey;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setCustomerManagedKey(@Nullable Boolean customerManagedKey) {
            this.customerManagedKey = customerManagedKey;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
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

        public GetSentinelOnboardingStateResult build() {
            return new GetSentinelOnboardingStateResult(customerManagedKey, etag, id, name, systemData, type);
        }
    }
}
