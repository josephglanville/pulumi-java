// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetTrafficManagerUserMetricsKeyResult {
    private final @Nullable String id;
    private final @Nullable String key;
    private final @Nullable String name;
    private final @Nullable String type;

    @OutputCustomType.Constructor({"id","key","name","type"})
    private GetTrafficManagerUserMetricsKeyResult(
        @Nullable String id,
        @Nullable String key,
        @Nullable String name,
        @Nullable String type) {
        this.id = id;
        this.key = key;
        this.name = name;
        this.type = type;
    }

    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> getKey() {
        return Optional.ofNullable(this.key);
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTrafficManagerUserMetricsKeyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String key;
        private @Nullable String name;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTrafficManagerUserMetricsKeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.key = defaults.key;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setKey(@Nullable String key) {
            this.key = key;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public GetTrafficManagerUserMetricsKeyResult build() {
            return new GetTrafficManagerUserMetricsKeyResult(id, key, name, type);
        }
    }
}
