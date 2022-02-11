// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TypedLocalObjectReference {
    private final @Nullable String apiGroup;
    private final String kind;
    private final String name;

    @OutputCustomType.Constructor({"apiGroup","kind","name"})
    private TypedLocalObjectReference(
        @Nullable String apiGroup,
        String kind,
        String name) {
        this.apiGroup = apiGroup;
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
    }

    public Optional<String> getApiGroup() {
        return Optional.ofNullable(this.apiGroup);
    }
    public String getKind() {
        return this.kind;
    }
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TypedLocalObjectReference defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apiGroup;
        private String kind;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(TypedLocalObjectReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiGroup = defaults.apiGroup;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
        }

        public Builder setApiGroup(@Nullable String apiGroup) {
            this.apiGroup = apiGroup;
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public TypedLocalObjectReference build() {
            return new TypedLocalObjectReference(apiGroup, kind, name);
        }
    }
}
