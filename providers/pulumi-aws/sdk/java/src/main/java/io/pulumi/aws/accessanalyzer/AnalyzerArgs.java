// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.accessanalyzer;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnalyzerArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalyzerArgs Empty = new AnalyzerArgs();

    /**
     * Name of the Analyzer.
     * 
     */
    @Import(name="analyzerName", required=true)
      private final Output<String> analyzerName;

    public Output<String> getAnalyzerName() {
        return this.analyzerName;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * Type of Analyzer. Valid values are `ACCOUNT` or `ORGANIZATION`. Defaults to `ACCOUNT`.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public AnalyzerArgs(
        Output<String> analyzerName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> type) {
        this.analyzerName = Objects.requireNonNull(analyzerName, "expected parameter 'analyzerName' to be non-null");
        this.tags = tags;
        this.type = type;
    }

    private AnalyzerArgs() {
        this.analyzerName = Output.empty();
        this.tags = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyzerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> analyzerName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyzerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analyzerName = defaults.analyzerName;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder analyzerName(Output<String> analyzerName) {
            this.analyzerName = Objects.requireNonNull(analyzerName);
            return this;
        }
        public Builder analyzerName(String analyzerName) {
            this.analyzerName = Output.of(Objects.requireNonNull(analyzerName));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Output.ofNullable(type);
            return this;
        }        public AnalyzerArgs build() {
            return new AnalyzerArgs(analyzerName, tags, type);
        }
    }
}
