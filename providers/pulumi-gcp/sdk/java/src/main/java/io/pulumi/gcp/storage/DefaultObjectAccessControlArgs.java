// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DefaultObjectAccessControlArgs extends io.pulumi.resources.ResourceArgs {

    public static final DefaultObjectAccessControlArgs Empty = new DefaultObjectAccessControlArgs();

    /**
     * The name of the bucket.
     * 
     */
    @InputImport(name="bucket", required=true)
      private final Output<String> bucket;

    public Output<String> getBucket() {
        return this.bucket;
    }

    /**
     * The entity holding the permission, in one of the following forms:
     * * user-{{userId}}
     * * user-{{email}} (such as "user-liz@example.com")
     * * group-{{groupId}}
     * * group-{{email}} (such as "group-example@googlegroups.com")
     * * domain-{{domain}} (such as "domain-example.com")
     * * project-team-{{projectId}}
     * * allUsers
     * * allAuthenticatedUsers
     * 
     */
    @InputImport(name="entity", required=true)
      private final Output<String> entity;

    public Output<String> getEntity() {
        return this.entity;
    }

    /**
     * The name of the object, if applied to an object.
     * 
     */
    @InputImport(name="object")
      private final @Nullable Output<String> object;

    public Output<String> getObject() {
        return this.object == null ? Output.empty() : this.object;
    }

    /**
     * The access permission for the entity.
     * Possible values are `OWNER` and `READER`.
     * 
     */
    @InputImport(name="role", required=true)
      private final Output<String> role;

    public Output<String> getRole() {
        return this.role;
    }

    public DefaultObjectAccessControlArgs(
        Output<String> bucket,
        Output<String> entity,
        @Nullable Output<String> object,
        Output<String> role) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.entity = Objects.requireNonNull(entity, "expected parameter 'entity' to be non-null");
        this.object = object;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private DefaultObjectAccessControlArgs() {
        this.bucket = Output.empty();
        this.entity = Output.empty();
        this.object = Output.empty();
        this.role = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultObjectAccessControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> bucket;
        private Output<String> entity;
        private @Nullable Output<String> object;
        private Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultObjectAccessControlArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.entity = defaults.entity;
    	      this.object = defaults.object;
    	      this.role = defaults.role;
        }

        public Builder bucket(Output<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder bucket(String bucket) {
            this.bucket = Output.of(Objects.requireNonNull(bucket));
            return this;
        }

        public Builder entity(Output<String> entity) {
            this.entity = Objects.requireNonNull(entity);
            return this;
        }

        public Builder entity(String entity) {
            this.entity = Output.of(Objects.requireNonNull(entity));
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

        public Builder role(Output<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder role(String role) {
            this.role = Output.of(Objects.requireNonNull(role));
            return this;
        }
        public DefaultObjectAccessControlArgs build() {
            return new DefaultObjectAccessControlArgs(bucket, entity, object, role);
        }
    }
}
