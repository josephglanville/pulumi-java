// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ExportTimePeriodArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExportTimePeriodArgs Empty = new ExportTimePeriodArgs();

    @InputImport(name="from", required=true)
    private final Input<String> from;

    public Input<String> getFrom() {
        return this.from;
    }

    @InputImport(name="to", required=true)
    private final Input<String> to;

    public Input<String> getTo() {
        return this.to;
    }

    public ExportTimePeriodArgs(
        Input<String> from,
        Input<String> to) {
        this.from = Objects.requireNonNull(from, "expected parameter 'from' to be non-null");
        this.to = Objects.requireNonNull(to, "expected parameter 'to' to be non-null");
    }

    private ExportTimePeriodArgs() {
        this.from = Input.empty();
        this.to = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExportTimePeriodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> from;
        private Input<String> to;

        public Builder() {
    	      // Empty
        }

        public Builder(ExportTimePeriodArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.from = defaults.from;
    	      this.to = defaults.to;
        }

        public Builder setFrom(Input<String> from) {
            this.from = Objects.requireNonNull(from);
            return this;
        }

        public Builder setFrom(String from) {
            this.from = Input.of(Objects.requireNonNull(from));
            return this;
        }

        public Builder setTo(Input<String> to) {
            this.to = Objects.requireNonNull(to);
            return this;
        }

        public Builder setTo(String to) {
            this.to = Input.of(Objects.requireNonNull(to));
            return this;
        }

        public ExportTimePeriodArgs build() {
            return new ExportTimePeriodArgs(from, to);
        }
    }
}
