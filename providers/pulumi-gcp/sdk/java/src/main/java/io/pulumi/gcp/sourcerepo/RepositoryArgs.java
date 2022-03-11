// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sourcerepo;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.sourcerepo.inputs.RepositoryPubsubConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RepositoryArgs extends io.pulumi.resources.ResourceArgs {

    public static final RepositoryArgs Empty = new RepositoryArgs();

    /**
     * Resource name of the repository, of the form `{{repo}}`.
     * The repo name may contain slashes. eg, `name/with/slash`
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * How this repository publishes a change in the repository through Cloud Pub/Sub.
     * Keyed by the topic names.
     * Structure is documented below.
     * 
     */
    @InputImport(name="pubsubConfigs")
      private final @Nullable Output<List<RepositoryPubsubConfigArgs>> pubsubConfigs;

    public Output<List<RepositoryPubsubConfigArgs>> getPubsubConfigs() {
        return this.pubsubConfigs == null ? Output.empty() : this.pubsubConfigs;
    }

    public RepositoryArgs(
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<List<RepositoryPubsubConfigArgs>> pubsubConfigs) {
        this.name = name;
        this.project = project;
        this.pubsubConfigs = pubsubConfigs;
    }

    private RepositoryArgs() {
        this.name = Output.empty();
        this.project = Output.empty();
        this.pubsubConfigs = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<List<RepositoryPubsubConfigArgs>> pubsubConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(RepositoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.pubsubConfigs = defaults.pubsubConfigs;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder pubsubConfigs(@Nullable Output<List<RepositoryPubsubConfigArgs>> pubsubConfigs) {
            this.pubsubConfigs = pubsubConfigs;
            return this;
        }

        public Builder pubsubConfigs(@Nullable List<RepositoryPubsubConfigArgs> pubsubConfigs) {
            this.pubsubConfigs = Output.ofNullable(pubsubConfigs);
            return this;
        }
        public RepositoryArgs build() {
            return new RepositoryArgs(name, project, pubsubConfigs);
        }
    }
}
