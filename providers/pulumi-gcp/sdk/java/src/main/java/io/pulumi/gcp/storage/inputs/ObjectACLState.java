// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ObjectACLState extends io.pulumi.resources.ResourceArgs {

    public static final ObjectACLState Empty = new ObjectACLState();

    /**
     * The name of the bucket the object is stored in.
     * 
     */
    @Import(name="bucket")
      private final @Nullable Output<String> bucket;

    public Output<String> getBucket() {
        return this.bucket == null ? Output.empty() : this.bucket;
    }

    /**
     * The name of the object to apply the acl to.
     * 
     */
    @Import(name="object")
      private final @Nullable Output<String> object;

    public Output<String> getObject() {
        return this.object == null ? Output.empty() : this.object;
    }

    /**
     * The "canned" [predefined ACL](https://cloud.google.com/storage/docs/access-control#predefined-acl) to apply. Must be set if `role_entity` is not.
     * 
     */
    @Import(name="predefinedAcl")
      private final @Nullable Output<String> predefinedAcl;

    public Output<String> getPredefinedAcl() {
        return this.predefinedAcl == null ? Output.empty() : this.predefinedAcl;
    }

    /**
     * List of role/entity pairs in the form `ROLE:entity`. See [GCS Object ACL documentation](https://cloud.google.com/storage/docs/json_api/v1/objectAccessControls) for more details.
     * Must be set if `predefined_acl` is not.
     * 
     */
    @Import(name="roleEntities")
      private final @Nullable Output<List<String>> roleEntities;

    public Output<List<String>> getRoleEntities() {
        return this.roleEntities == null ? Output.empty() : this.roleEntities;
    }

    public ObjectACLState(
        @Nullable Output<String> bucket,
        @Nullable Output<String> object,
        @Nullable Output<String> predefinedAcl,
        @Nullable Output<List<String>> roleEntities) {
        this.bucket = bucket;
        this.object = object;
        this.predefinedAcl = predefinedAcl;
        this.roleEntities = roleEntities;
    }

    private ObjectACLState() {
        this.bucket = Output.empty();
        this.object = Output.empty();
        this.predefinedAcl = Output.empty();
        this.roleEntities = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectACLState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> bucket;
        private @Nullable Output<String> object;
        private @Nullable Output<String> predefinedAcl;
        private @Nullable Output<List<String>> roleEntities;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectACLState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.object = defaults.object;
    	      this.predefinedAcl = defaults.predefinedAcl;
    	      this.roleEntities = defaults.roleEntities;
        }

        public Builder bucket(@Nullable Output<String> bucket) {
            this.bucket = bucket;
            return this;
        }
        public Builder bucket(@Nullable String bucket) {
            this.bucket = Output.ofNullable(bucket);
            return this;
        }
        public Builder object(@Nullable Output<String> object) {
            this.object = object;
            return this;
        }
        public Builder object(@Nullable String object) {
            this.object = Output.ofNullable(object);
            return this;
        }
        public Builder predefinedAcl(@Nullable Output<String> predefinedAcl) {
            this.predefinedAcl = predefinedAcl;
            return this;
        }
        public Builder predefinedAcl(@Nullable String predefinedAcl) {
            this.predefinedAcl = Output.ofNullable(predefinedAcl);
            return this;
        }
        public Builder roleEntities(@Nullable Output<List<String>> roleEntities) {
            this.roleEntities = roleEntities;
            return this;
        }
        public Builder roleEntities(@Nullable List<String> roleEntities) {
            this.roleEntities = Output.ofNullable(roleEntities);
            return this;
        }
        public Builder roleEntities(String... roleEntities) {
            return roleEntities(List.of(roleEntities));
        }        public ObjectACLState build() {
            return new ObjectACLState(bucket, object, predefinedAcl, roleEntities);
        }
    }
}
