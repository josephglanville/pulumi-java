// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.pinpoint.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppQuietTimeArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppQuietTimeArgs Empty = new AppQuietTimeArgs();

    /**
     * The default end time for quiet time in ISO 8601 format. Required if `start` is set
     * 
     */
    @Import(name="end")
      private final @Nullable Output<String> end;

    public Output<String> getEnd() {
        return this.end == null ? Codegen.empty() : this.end;
    }

    /**
     * The default start time for quiet time in ISO 8601 format. Required if `end` is set
     * 
     */
    @Import(name="start")
      private final @Nullable Output<String> start;

    public Output<String> getStart() {
        return this.start == null ? Codegen.empty() : this.start;
    }

    public AppQuietTimeArgs(
        @Nullable Output<String> end,
        @Nullable Output<String> start) {
        this.end = end;
        this.start = start;
    }

    private AppQuietTimeArgs() {
        this.end = Codegen.empty();
        this.start = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppQuietTimeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> end;
        private @Nullable Output<String> start;

        public Builder() {
    	      // Empty
        }

        public Builder(AppQuietTimeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.end = defaults.end;
    	      this.start = defaults.start;
        }

        public Builder end(@Nullable Output<String> end) {
            this.end = end;
            return this;
        }
        public Builder end(@Nullable String end) {
            this.end = Codegen.ofNullable(end);
            return this;
        }
        public Builder start(@Nullable Output<String> start) {
            this.start = start;
            return this;
        }
        public Builder start(@Nullable String start) {
            this.start = Codegen.ofNullable(start);
            return this;
        }        public AppQuietTimeArgs build() {
            return new AppQuietTimeArgs(end, start);
        }
    }
}
