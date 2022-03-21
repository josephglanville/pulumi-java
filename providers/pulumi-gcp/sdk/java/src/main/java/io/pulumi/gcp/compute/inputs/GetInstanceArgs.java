// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstanceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetInstanceArgs Empty = new GetInstanceArgs();

    /**
     * The name of the instance. One of `name` or `self_link` must be provided.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If `self_link` is provided, this value is ignored.  If neither `self_link`
     * nor `project` are provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    /**
     * The self link of the instance. One of `name` or `self_link` must be provided.
     * 
     */
    @Import(name="selfLink")
      private final @Nullable String selfLink;

    public Optional<String> getSelfLink() {
        return this.selfLink == null ? Optional.empty() : Optional.ofNullable(this.selfLink);
    }

    /**
     * The zone of the instance. If `self_link` is provided, this
     * value is ignored.  If neither `self_link` nor `zone` are provided, the
     * provider zone is used.
     * 
     */
    @Import(name="zone")
      private final @Nullable String zone;

    public Optional<String> getZone() {
        return this.zone == null ? Optional.empty() : Optional.ofNullable(this.zone);
    }

    public GetInstanceArgs(
        @Nullable String name,
        @Nullable String project,
        @Nullable String selfLink,
        @Nullable String zone) {
        this.name = name;
        this.project = project;
        this.selfLink = selfLink;
        this.zone = zone;
    }

    private GetInstanceArgs() {
        this.name = null;
        this.project = null;
        this.selfLink = null;
        this.zone = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String project;
        private @Nullable String selfLink;
        private @Nullable String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.selfLink = defaults.selfLink;
    	      this.zone = defaults.zone;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder selfLink(@Nullable String selfLink) {
            this.selfLink = selfLink;
            return this;
        }
        public Builder zone(@Nullable String zone) {
            this.zone = zone;
            return this;
        }        public GetInstanceArgs build() {
            return new GetInstanceArgs(name, project, selfLink, zone);
        }
    }
}
