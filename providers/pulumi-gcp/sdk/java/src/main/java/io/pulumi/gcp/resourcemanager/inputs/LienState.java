// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.resourcemanager.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LienState extends io.pulumi.resources.ResourceArgs {

    public static final LienState Empty = new LienState();

    /**
     * Time of creation
     * 
     */
    @InputImport(name="createTime")
      private final @Nullable Output<String> createTime;

    public Output<String> getCreateTime() {
        return this.createTime == null ? Output.empty() : this.createTime;
    }

    /**
     * A system-generated unique identifier for this Lien.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * A stable, user-visible/meaningful string identifying the origin
     * of the Lien, intended to be inspected programmatically. Maximum length of
     * 200 characters.
     * 
     */
    @InputImport(name="origin")
      private final @Nullable Output<String> origin;

    public Output<String> getOrigin() {
        return this.origin == null ? Output.empty() : this.origin;
    }

    /**
     * A reference to the resource this Lien is attached to.
     * The server will validate the parent against those for which Liens are supported.
     * Since a variety of objects can have Liens against them, you must provide the type
     * prefix (e.g. "projects/my-project-name").
     * 
     */
    @InputImport(name="parent")
      private final @Nullable Output<String> parent;

    public Output<String> getParent() {
        return this.parent == null ? Output.empty() : this.parent;
    }

    /**
     * Concise user-visible strings indicating why an action cannot be performed
     * on a resource. Maximum length of 200 characters.
     * 
     */
    @InputImport(name="reason")
      private final @Nullable Output<String> reason;

    public Output<String> getReason() {
        return this.reason == null ? Output.empty() : this.reason;
    }

    /**
     * The types of operations which should be blocked as a result of this Lien.
     * Each value should correspond to an IAM permission. The server will validate
     * the permissions against those for which Liens are supported.  An empty
     * list is meaningless and will be rejected.
     * e.g. ['resourcemanager.projects.delete']
     * 
     */
    @InputImport(name="restrictions")
      private final @Nullable Output<List<String>> restrictions;

    public Output<List<String>> getRestrictions() {
        return this.restrictions == null ? Output.empty() : this.restrictions;
    }

    public LienState(
        @Nullable Output<String> createTime,
        @Nullable Output<String> name,
        @Nullable Output<String> origin,
        @Nullable Output<String> parent,
        @Nullable Output<String> reason,
        @Nullable Output<List<String>> restrictions) {
        this.createTime = createTime;
        this.name = name;
        this.origin = origin;
        this.parent = parent;
        this.reason = reason;
        this.restrictions = restrictions;
    }

    private LienState() {
        this.createTime = Output.empty();
        this.name = Output.empty();
        this.origin = Output.empty();
        this.parent = Output.empty();
        this.reason = Output.empty();
        this.restrictions = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LienState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> createTime;
        private @Nullable Output<String> name;
        private @Nullable Output<String> origin;
        private @Nullable Output<String> parent;
        private @Nullable Output<String> reason;
        private @Nullable Output<List<String>> restrictions;

        public Builder() {
    	      // Empty
        }

        public Builder(LienState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.name = defaults.name;
    	      this.origin = defaults.origin;
    	      this.parent = defaults.parent;
    	      this.reason = defaults.reason;
    	      this.restrictions = defaults.restrictions;
        }

        public Builder createTime(@Nullable Output<String> createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder createTime(@Nullable String createTime) {
            this.createTime = Output.ofNullable(createTime);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder origin(@Nullable Output<String> origin) {
            this.origin = origin;
            return this;
        }

        public Builder origin(@Nullable String origin) {
            this.origin = Output.ofNullable(origin);
            return this;
        }

        public Builder parent(@Nullable Output<String> parent) {
            this.parent = parent;
            return this;
        }

        public Builder parent(@Nullable String parent) {
            this.parent = Output.ofNullable(parent);
            return this;
        }

        public Builder reason(@Nullable Output<String> reason) {
            this.reason = reason;
            return this;
        }

        public Builder reason(@Nullable String reason) {
            this.reason = Output.ofNullable(reason);
            return this;
        }

        public Builder restrictions(@Nullable Output<List<String>> restrictions) {
            this.restrictions = restrictions;
            return this;
        }

        public Builder restrictions(@Nullable List<String> restrictions) {
            this.restrictions = Output.ofNullable(restrictions);
            return this;
        }
        public LienState build() {
            return new LienState(createTime, name, origin, parent, reason, restrictions);
        }
    }
}
