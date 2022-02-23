// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.authentication.k8s.io_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * BoundObjectReference is a reference to an object that a token is bound to.
 * 
 */
public final class BoundObjectReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final BoundObjectReferenceArgs Empty = new BoundObjectReferenceArgs();

    /**
     * API version of the referent.
     * 
     */
    @InputImport(name="apiVersion")
      private final @Nullable Input<String> apiVersion;

    public Input<String> getApiVersion() {
        return this.apiVersion == null ? Input.empty() : this.apiVersion;
    }

    /**
     * Kind of the referent. Valid kinds are 'Pod' and 'Secret'.
     * 
     */
    @InputImport(name="kind")
      private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * Name of the referent.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * UID of the referent.
     * 
     */
    @InputImport(name="uid")
      private final @Nullable Input<String> uid;

    public Input<String> getUid() {
        return this.uid == null ? Input.empty() : this.uid;
    }

    public BoundObjectReferenceArgs(
        @Nullable Input<String> apiVersion,
        @Nullable Input<String> kind,
        @Nullable Input<String> name,
        @Nullable Input<String> uid) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.name = name;
        this.uid = uid;
    }

    private BoundObjectReferenceArgs() {
        this.apiVersion = Input.empty();
        this.kind = Input.empty();
        this.name = Input.empty();
        this.uid = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BoundObjectReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiVersion;
        private @Nullable Input<String> kind;
        private @Nullable Input<String> name;
        private @Nullable Input<String> uid;

        public Builder() {
    	      // Empty
        }

        public Builder(BoundObjectReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.uid = defaults.uid;
        }

        public Builder setApiVersion(@Nullable Input<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder setApiVersion(@Nullable String apiVersion) {
            this.apiVersion = Input.ofNullable(apiVersion);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setUid(@Nullable Input<String> uid) {
            this.uid = uid;
            return this;
        }

        public Builder setUid(@Nullable String uid) {
            this.uid = Input.ofNullable(uid);
            return this;
        }
        public BoundObjectReferenceArgs build() {
            return new BoundObjectReferenceArgs(apiVersion, kind, name, uid);
        }
    }
}
