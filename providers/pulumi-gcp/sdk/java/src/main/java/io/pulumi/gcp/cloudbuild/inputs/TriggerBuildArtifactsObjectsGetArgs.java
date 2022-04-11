// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.cloudbuild.inputs.TriggerBuildArtifactsObjectsTimingGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerBuildArtifactsObjectsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerBuildArtifactsObjectsGetArgs Empty = new TriggerBuildArtifactsObjectsGetArgs();

    /**
     * Cloud Storage bucket and optional object path, in the form "gs://bucket/path/to/somewhere/".
     * Files in the workspace matching any path pattern will be uploaded to Cloud Storage with
     * this location as a prefix.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Path globs used to match files in the build's workspace.
     * 
     */
    @Import(name="paths")
      private final @Nullable Output<List<String>> paths;

    public Output<List<String>> getPaths() {
        return this.paths == null ? Codegen.empty() : this.paths;
    }

    /**
     * - 
     * Output only. Stores timing information for pushing all artifact objects.
     * Structure is documented below.
     * 
     */
    @Import(name="timings")
      private final @Nullable Output<List<TriggerBuildArtifactsObjectsTimingGetArgs>> timings;

    public Output<List<TriggerBuildArtifactsObjectsTimingGetArgs>> getTimings() {
        return this.timings == null ? Codegen.empty() : this.timings;
    }

    public TriggerBuildArtifactsObjectsGetArgs(
        @Nullable Output<String> location,
        @Nullable Output<List<String>> paths,
        @Nullable Output<List<TriggerBuildArtifactsObjectsTimingGetArgs>> timings) {
        this.location = location;
        this.paths = paths;
        this.timings = timings;
    }

    private TriggerBuildArtifactsObjectsGetArgs() {
        this.location = Codegen.empty();
        this.paths = Codegen.empty();
        this.timings = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerBuildArtifactsObjectsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> location;
        private @Nullable Output<List<String>> paths;
        private @Nullable Output<List<TriggerBuildArtifactsObjectsTimingGetArgs>> timings;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerBuildArtifactsObjectsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.paths = defaults.paths;
    	      this.timings = defaults.timings;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder paths(@Nullable Output<List<String>> paths) {
            this.paths = paths;
            return this;
        }
        public Builder paths(@Nullable List<String> paths) {
            this.paths = Codegen.ofNullable(paths);
            return this;
        }
        public Builder paths(String... paths) {
            return paths(List.of(paths));
        }
        public Builder timings(@Nullable Output<List<TriggerBuildArtifactsObjectsTimingGetArgs>> timings) {
            this.timings = timings;
            return this;
        }
        public Builder timings(@Nullable List<TriggerBuildArtifactsObjectsTimingGetArgs> timings) {
            this.timings = Codegen.ofNullable(timings);
            return this;
        }
        public Builder timings(TriggerBuildArtifactsObjectsTimingGetArgs... timings) {
            return timings(List.of(timings));
        }        public TriggerBuildArtifactsObjectsGetArgs build() {
            return new TriggerBuildArtifactsObjectsGetArgs(location, paths, timings);
        }
    }
}
