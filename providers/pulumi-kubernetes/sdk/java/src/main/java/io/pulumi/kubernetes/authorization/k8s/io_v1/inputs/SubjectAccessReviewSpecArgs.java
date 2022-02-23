// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.authorization.k8s.io_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.authorization.k8s.io_v1.inputs.NonResourceAttributesArgs;
import io.pulumi.kubernetes.authorization.k8s.io_v1.inputs.ResourceAttributesArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
 * 
 */
public final class SubjectAccessReviewSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubjectAccessReviewSpecArgs Empty = new SubjectAccessReviewSpecArgs();

    /**
     * Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer it needs a reflection here.
     * 
     */
    @InputImport(name="extra")
      private final @Nullable Input<Map<String,List<String>>> extra;

    public Input<Map<String,List<String>>> getExtra() {
        return this.extra == null ? Input.empty() : this.extra;
    }

    /**
     * Groups is the groups you're testing for.
     * 
     */
    @InputImport(name="groups")
      private final @Nullable Input<List<String>> groups;

    public Input<List<String>> getGroups() {
        return this.groups == null ? Input.empty() : this.groups;
    }

    /**
     * NonResourceAttributes describes information for a non-resource access request
     * 
     */
    @InputImport(name="nonResourceAttributes")
      private final @Nullable Input<NonResourceAttributesArgs> nonResourceAttributes;

    public Input<NonResourceAttributesArgs> getNonResourceAttributes() {
        return this.nonResourceAttributes == null ? Input.empty() : this.nonResourceAttributes;
    }

    /**
     * ResourceAuthorizationAttributes describes information for a resource access request
     * 
     */
    @InputImport(name="resourceAttributes")
      private final @Nullable Input<ResourceAttributesArgs> resourceAttributes;

    public Input<ResourceAttributesArgs> getResourceAttributes() {
        return this.resourceAttributes == null ? Input.empty() : this.resourceAttributes;
    }

    /**
     * UID information about the requesting user.
     * 
     */
    @InputImport(name="uid")
      private final @Nullable Input<String> uid;

    public Input<String> getUid() {
        return this.uid == null ? Input.empty() : this.uid;
    }

    /**
     * User is the user you're testing for. If you specify "User" but not "Groups", then is it interpreted as "What if User were not a member of any groups
     * 
     */
    @InputImport(name="user")
      private final @Nullable Input<String> user;

    public Input<String> getUser() {
        return this.user == null ? Input.empty() : this.user;
    }

    public SubjectAccessReviewSpecArgs(
        @Nullable Input<Map<String,List<String>>> extra,
        @Nullable Input<List<String>> groups,
        @Nullable Input<NonResourceAttributesArgs> nonResourceAttributes,
        @Nullable Input<ResourceAttributesArgs> resourceAttributes,
        @Nullable Input<String> uid,
        @Nullable Input<String> user) {
        this.extra = extra;
        this.groups = groups;
        this.nonResourceAttributes = nonResourceAttributes;
        this.resourceAttributes = resourceAttributes;
        this.uid = uid;
        this.user = user;
    }

    private SubjectAccessReviewSpecArgs() {
        this.extra = Input.empty();
        this.groups = Input.empty();
        this.nonResourceAttributes = Input.empty();
        this.resourceAttributes = Input.empty();
        this.uid = Input.empty();
        this.user = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubjectAccessReviewSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,List<String>>> extra;
        private @Nullable Input<List<String>> groups;
        private @Nullable Input<NonResourceAttributesArgs> nonResourceAttributes;
        private @Nullable Input<ResourceAttributesArgs> resourceAttributes;
        private @Nullable Input<String> uid;
        private @Nullable Input<String> user;

        public Builder() {
    	      // Empty
        }

        public Builder(SubjectAccessReviewSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extra = defaults.extra;
    	      this.groups = defaults.groups;
    	      this.nonResourceAttributes = defaults.nonResourceAttributes;
    	      this.resourceAttributes = defaults.resourceAttributes;
    	      this.uid = defaults.uid;
    	      this.user = defaults.user;
        }

        public Builder setExtra(@Nullable Input<Map<String,List<String>>> extra) {
            this.extra = extra;
            return this;
        }

        public Builder setExtra(@Nullable Map<String,List<String>> extra) {
            this.extra = Input.ofNullable(extra);
            return this;
        }

        public Builder setGroups(@Nullable Input<List<String>> groups) {
            this.groups = groups;
            return this;
        }

        public Builder setGroups(@Nullable List<String> groups) {
            this.groups = Input.ofNullable(groups);
            return this;
        }

        public Builder setNonResourceAttributes(@Nullable Input<NonResourceAttributesArgs> nonResourceAttributes) {
            this.nonResourceAttributes = nonResourceAttributes;
            return this;
        }

        public Builder setNonResourceAttributes(@Nullable NonResourceAttributesArgs nonResourceAttributes) {
            this.nonResourceAttributes = Input.ofNullable(nonResourceAttributes);
            return this;
        }

        public Builder setResourceAttributes(@Nullable Input<ResourceAttributesArgs> resourceAttributes) {
            this.resourceAttributes = resourceAttributes;
            return this;
        }

        public Builder setResourceAttributes(@Nullable ResourceAttributesArgs resourceAttributes) {
            this.resourceAttributes = Input.ofNullable(resourceAttributes);
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

        public Builder setUser(@Nullable Input<String> user) {
            this.user = user;
            return this;
        }

        public Builder setUser(@Nullable String user) {
            this.user = Input.ofNullable(user);
            return this;
        }
        public SubjectAccessReviewSpecArgs build() {
            return new SubjectAccessReviewSpecArgs(extra, groups, nonResourceAttributes, resourceAttributes, uid, user);
        }
    }
}
