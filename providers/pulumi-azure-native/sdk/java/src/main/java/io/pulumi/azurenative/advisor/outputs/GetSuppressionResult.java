// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.advisor.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetSuppressionResult {
    private final String expirationTimeStamp;
    private final String id;
    private final String name;
    private final @Nullable String suppressionId;
    private final @Nullable String ttl;
    private final String type;

    @OutputCustomType.Constructor({"expirationTimeStamp","id","name","suppressionId","ttl","type"})
    private GetSuppressionResult(
        String expirationTimeStamp,
        String id,
        String name,
        @Nullable String suppressionId,
        @Nullable String ttl,
        String type) {
        this.expirationTimeStamp = Objects.requireNonNull(expirationTimeStamp);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.suppressionId = suppressionId;
        this.ttl = ttl;
        this.type = Objects.requireNonNull(type);
    }

    public String getExpirationTimeStamp() {
        return this.expirationTimeStamp;
    }
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getSuppressionId() {
        return Optional.ofNullable(this.suppressionId);
    }
    public Optional<String> getTtl() {
        return Optional.ofNullable(this.ttl);
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSuppressionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expirationTimeStamp;
        private String id;
        private String name;
        private @Nullable String suppressionId;
        private @Nullable String ttl;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSuppressionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationTimeStamp = defaults.expirationTimeStamp;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.suppressionId = defaults.suppressionId;
    	      this.ttl = defaults.ttl;
    	      this.type = defaults.type;
        }

        public Builder setExpirationTimeStamp(String expirationTimeStamp) {
            this.expirationTimeStamp = Objects.requireNonNull(expirationTimeStamp);
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

        public Builder setSuppressionId(@Nullable String suppressionId) {
            this.suppressionId = suppressionId;
            return this;
        }

        public Builder setTtl(@Nullable String ttl) {
            this.ttl = ttl;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetSuppressionResult build() {
            return new GetSuppressionResult(expirationTimeStamp, id, name, suppressionId, ttl, type);
        }
    }
}
