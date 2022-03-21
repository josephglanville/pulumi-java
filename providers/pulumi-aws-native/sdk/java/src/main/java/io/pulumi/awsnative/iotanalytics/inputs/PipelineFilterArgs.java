// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PipelineFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineFilterArgs Empty = new PipelineFilterArgs();

    @Import(name="filter", required=true)
      private final Output<String> filter;

    public Output<String> getFilter() {
        return this.filter;
    }

    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    @Import(name="next")
      private final @Nullable Output<String> next;

    public Output<String> getNext() {
        return this.next == null ? Output.empty() : this.next;
    }

    public PipelineFilterArgs(
        Output<String> filter,
        Output<String> name,
        @Nullable Output<String> next) {
        this.filter = Objects.requireNonNull(filter, "expected parameter 'filter' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.next = next;
    }

    private PipelineFilterArgs() {
        this.filter = Output.empty();
        this.name = Output.empty();
        this.next = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> filter;
        private Output<String> name;
        private @Nullable Output<String> next;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
    	      this.name = defaults.name;
    	      this.next = defaults.next;
        }

        public Builder filter(Output<String> filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }
        public Builder filter(String filter) {
            this.filter = Output.of(Objects.requireNonNull(filter));
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder next(@Nullable Output<String> next) {
            this.next = next;
            return this;
        }
        public Builder next(@Nullable String next) {
            this.next = Output.ofNullable(next);
            return this;
        }        public PipelineFilterArgs build() {
            return new PipelineFilterArgs(filter, name, next);
        }
    }
}
