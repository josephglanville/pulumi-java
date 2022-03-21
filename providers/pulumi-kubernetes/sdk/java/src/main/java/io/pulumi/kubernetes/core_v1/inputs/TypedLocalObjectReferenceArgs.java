// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * TypedLocalObjectReference contains enough information to let you locate the typed referenced object inside the same namespace.
 * 
 */
public final class TypedLocalObjectReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final TypedLocalObjectReferenceArgs Empty = new TypedLocalObjectReferenceArgs();

    /**
     * APIGroup is the group for the resource being referenced. If APIGroup is not specified, the specified Kind must be in the core API group. For any other third-party types, APIGroup is required.
     * 
     */
    @Import(name="apiGroup")
      private final @Nullable Output<String> apiGroup;

    public Output<String> getApiGroup() {
        return this.apiGroup == null ? Output.empty() : this.apiGroup;
    }

    /**
     * Kind is the type of resource being referenced
     * 
     */
    @Import(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }

    /**
     * Name is the name of resource being referenced
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    public TypedLocalObjectReferenceArgs(
        @Nullable Output<String> apiGroup,
        Output<String> kind,
        Output<String> name) {
        this.apiGroup = apiGroup;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private TypedLocalObjectReferenceArgs() {
        this.apiGroup = Output.empty();
        this.kind = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TypedLocalObjectReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> apiGroup;
        private Output<String> kind;
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(TypedLocalObjectReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiGroup = defaults.apiGroup;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
        }

        public Builder apiGroup(@Nullable Output<String> apiGroup) {
            this.apiGroup = apiGroup;
            return this;
        }
        public Builder apiGroup(@Nullable String apiGroup) {
            this.apiGroup = Output.ofNullable(apiGroup);
            return this;
        }
        public Builder kind(Output<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }        public TypedLocalObjectReferenceArgs build() {
            return new TypedLocalObjectReferenceArgs(apiGroup, kind, name);
        }
    }
}
