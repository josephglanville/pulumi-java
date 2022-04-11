// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.storage_v1.inputs.ObjectAccessControlProjectTeamArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An access-control entry.
 * 
 */
public final class ObjectAccessControlArgs extends io.pulumi.resources.ResourceArgs {

    public static final ObjectAccessControlArgs Empty = new ObjectAccessControlArgs();

    /**
     * The name of the bucket.
     * 
     */
    @Import(name="bucket")
      private final @Nullable Output<String> bucket;

    public Output<String> getBucket() {
        return this.bucket == null ? Codegen.empty() : this.bucket;
    }

    /**
     * The domain associated with the entity, if any.
     * 
     */
    @Import(name="domain")
      private final @Nullable Output<String> domain;

    public Output<String> getDomain() {
        return this.domain == null ? Codegen.empty() : this.domain;
    }

    /**
     * The email address associated with the entity, if any.
     * 
     */
    @Import(name="email")
      private final @Nullable Output<String> email;

    public Output<String> getEmail() {
        return this.email == null ? Codegen.empty() : this.email;
    }

    /**
     * The entity holding the permission, in one of the following forms:
     * - user-userId
     * - user-email
     * - group-groupId
     * - group-email
     * - domain-domain
     * - project-team-projectId
     * - allUsers
     * - allAuthenticatedUsers Examples:
     * - The user liz@example.com would be user-liz@example.com.
     * - The group example@googlegroups.com would be group-example@googlegroups.com.
     * - To refer to all members of the Google Apps for Business domain example.com, the entity would be domain-example.com.
     * 
     */
    @Import(name="entity")
      private final @Nullable Output<String> entity;

    public Output<String> getEntity() {
        return this.entity == null ? Codegen.empty() : this.entity;
    }

    /**
     * The ID for the entity, if any.
     * 
     */
    @Import(name="entityId")
      private final @Nullable Output<String> entityId;

    public Output<String> getEntityId() {
        return this.entityId == null ? Codegen.empty() : this.entityId;
    }

    /**
     * HTTP 1.1 Entity tag for the access-control entry.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Codegen.empty() : this.etag;
    }

    /**
     * The content generation of the object, if applied to an object.
     * 
     */
    @Import(name="generation")
      private final @Nullable Output<String> generation;

    public Output<String> getGeneration() {
        return this.generation == null ? Codegen.empty() : this.generation;
    }

    /**
     * The ID of the access-control entry.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * The kind of item this is. For object access control entries, this is always storage#objectAccessControl.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    /**
     * The name of the object, if applied to an object.
     * 
     */
    @Import(name="object")
      private final @Nullable Output<String> object;

    public Output<String> getObject() {
        return this.object == null ? Codegen.empty() : this.object;
    }

    /**
     * The project team associated with the entity, if any.
     * 
     */
    @Import(name="projectTeam")
      private final @Nullable Output<ObjectAccessControlProjectTeamArgs> projectTeam;

    public Output<ObjectAccessControlProjectTeamArgs> getProjectTeam() {
        return this.projectTeam == null ? Codegen.empty() : this.projectTeam;
    }

    /**
     * The access permission for the entity.
     * 
     */
    @Import(name="role")
      private final @Nullable Output<String> role;

    public Output<String> getRole() {
        return this.role == null ? Codegen.empty() : this.role;
    }

    /**
     * The link to this access-control entry.
     * 
     */
    @Import(name="selfLink")
      private final @Nullable Output<String> selfLink;

    public Output<String> getSelfLink() {
        return this.selfLink == null ? Codegen.empty() : this.selfLink;
    }

    public ObjectAccessControlArgs(
        @Nullable Output<String> bucket,
        @Nullable Output<String> domain,
        @Nullable Output<String> email,
        @Nullable Output<String> entity,
        @Nullable Output<String> entityId,
        @Nullable Output<String> etag,
        @Nullable Output<String> generation,
        @Nullable Output<String> id,
        @Nullable Output<String> kind,
        @Nullable Output<String> object,
        @Nullable Output<ObjectAccessControlProjectTeamArgs> projectTeam,
        @Nullable Output<String> role,
        @Nullable Output<String> selfLink) {
        this.bucket = bucket;
        this.domain = domain;
        this.email = email;
        this.entity = entity;
        this.entityId = entityId;
        this.etag = etag;
        this.generation = generation;
        this.id = id;
        this.kind = kind;
        this.object = object;
        this.projectTeam = projectTeam;
        this.role = role;
        this.selfLink = selfLink;
    }

    private ObjectAccessControlArgs() {
        this.bucket = Codegen.empty();
        this.domain = Codegen.empty();
        this.email = Codegen.empty();
        this.entity = Codegen.empty();
        this.entityId = Codegen.empty();
        this.etag = Codegen.empty();
        this.generation = Codegen.empty();
        this.id = Codegen.empty();
        this.kind = Codegen.empty();
        this.object = Codegen.empty();
        this.projectTeam = Codegen.empty();
        this.role = Codegen.empty();
        this.selfLink = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectAccessControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> bucket;
        private @Nullable Output<String> domain;
        private @Nullable Output<String> email;
        private @Nullable Output<String> entity;
        private @Nullable Output<String> entityId;
        private @Nullable Output<String> etag;
        private @Nullable Output<String> generation;
        private @Nullable Output<String> id;
        private @Nullable Output<String> kind;
        private @Nullable Output<String> object;
        private @Nullable Output<ObjectAccessControlProjectTeamArgs> projectTeam;
        private @Nullable Output<String> role;
        private @Nullable Output<String> selfLink;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectAccessControlArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.domain = defaults.domain;
    	      this.email = defaults.email;
    	      this.entity = defaults.entity;
    	      this.entityId = defaults.entityId;
    	      this.etag = defaults.etag;
    	      this.generation = defaults.generation;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.object = defaults.object;
    	      this.projectTeam = defaults.projectTeam;
    	      this.role = defaults.role;
    	      this.selfLink = defaults.selfLink;
        }

        public Builder bucket(@Nullable Output<String> bucket) {
            this.bucket = bucket;
            return this;
        }
        public Builder bucket(@Nullable String bucket) {
            this.bucket = Codegen.ofNullable(bucket);
            return this;
        }
        public Builder domain(@Nullable Output<String> domain) {
            this.domain = domain;
            return this;
        }
        public Builder domain(@Nullable String domain) {
            this.domain = Codegen.ofNullable(domain);
            return this;
        }
        public Builder email(@Nullable Output<String> email) {
            this.email = email;
            return this;
        }
        public Builder email(@Nullable String email) {
            this.email = Codegen.ofNullable(email);
            return this;
        }
        public Builder entity(@Nullable Output<String> entity) {
            this.entity = entity;
            return this;
        }
        public Builder entity(@Nullable String entity) {
            this.entity = Codegen.ofNullable(entity);
            return this;
        }
        public Builder entityId(@Nullable Output<String> entityId) {
            this.entityId = entityId;
            return this;
        }
        public Builder entityId(@Nullable String entityId) {
            this.entityId = Codegen.ofNullable(entityId);
            return this;
        }
        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Codegen.ofNullable(etag);
            return this;
        }
        public Builder generation(@Nullable Output<String> generation) {
            this.generation = generation;
            return this;
        }
        public Builder generation(@Nullable String generation) {
            this.generation = Codegen.ofNullable(generation);
            return this;
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }
        public Builder object(@Nullable Output<String> object) {
            this.object = object;
            return this;
        }
        public Builder object(@Nullable String object) {
            this.object = Codegen.ofNullable(object);
            return this;
        }
        public Builder projectTeam(@Nullable Output<ObjectAccessControlProjectTeamArgs> projectTeam) {
            this.projectTeam = projectTeam;
            return this;
        }
        public Builder projectTeam(@Nullable ObjectAccessControlProjectTeamArgs projectTeam) {
            this.projectTeam = Codegen.ofNullable(projectTeam);
            return this;
        }
        public Builder role(@Nullable Output<String> role) {
            this.role = role;
            return this;
        }
        public Builder role(@Nullable String role) {
            this.role = Codegen.ofNullable(role);
            return this;
        }
        public Builder selfLink(@Nullable Output<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }
        public Builder selfLink(@Nullable String selfLink) {
            this.selfLink = Codegen.ofNullable(selfLink);
            return this;
        }        public ObjectAccessControlArgs build() {
            return new ObjectAccessControlArgs(bucket, domain, email, entity, entityId, etag, generation, id, kind, object, projectTeam, role, selfLink);
        }
    }
}
