// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.securitycenter_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The config for streaming-based notifications, which send each event as soon as it is detected.
 * 
 */
public final class StreamingConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final StreamingConfigArgs Empty = new StreamingConfigArgs();

    /**
     * Expression that defines the filter to apply across create/update events of assets or findings as specified by the event type. The expression is a list of zero or more restrictions combined via logical operators `AND` and `OR`. Parentheses are supported, and `OR` has higher precedence than `AND`. Restrictions have the form ` ` and may have a `-` character in front of them to indicate negation. The fields map to those defined in the corresponding resource. The supported operators are: * `=` for all value types. * `>`, `<`, `>=`, `<=` for integer values. * `:`, meaning substring matching, for strings. The supported value types are: * string literals in quotes. * integer literals without quotes. * boolean literals `true` and `false` without quotes.
     * 
     */
    @Import(name="filter")
      private final @Nullable Output<String> filter;

    public Output<String> getFilter() {
        return this.filter == null ? Output.empty() : this.filter;
    }

    public StreamingConfigArgs(@Nullable Output<String> filter) {
        this.filter = filter;
    }

    private StreamingConfigArgs() {
        this.filter = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> filter;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamingConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
        }

        public Builder filter(@Nullable Output<String> filter) {
            this.filter = filter;
            return this;
        }
        public Builder filter(@Nullable String filter) {
            this.filter = Output.ofNullable(filter);
            return this;
        }        public StreamingConfigArgs build() {
            return new StreamingConfigArgs(filter);
        }
    }
}
