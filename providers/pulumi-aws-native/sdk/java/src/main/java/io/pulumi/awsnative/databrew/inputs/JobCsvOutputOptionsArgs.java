// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Output Csv options
 * 
 */
public final class JobCsvOutputOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobCsvOutputOptionsArgs Empty = new JobCsvOutputOptionsArgs();

    @Import(name="delimiter")
      private final @Nullable Output<String> delimiter;

    public Output<String> getDelimiter() {
        return this.delimiter == null ? Codegen.empty() : this.delimiter;
    }

    public JobCsvOutputOptionsArgs(@Nullable Output<String> delimiter) {
        this.delimiter = delimiter;
    }

    private JobCsvOutputOptionsArgs() {
        this.delimiter = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobCsvOutputOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> delimiter;

        public Builder() {
    	      // Empty
        }

        public Builder(JobCsvOutputOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delimiter = defaults.delimiter;
        }

        public Builder delimiter(@Nullable Output<String> delimiter) {
            this.delimiter = delimiter;
            return this;
        }
        public Builder delimiter(@Nullable String delimiter) {
            this.delimiter = Codegen.ofNullable(delimiter);
            return this;
        }        public JobCsvOutputOptionsArgs build() {
            return new JobCsvOutputOptionsArgs(delimiter);
        }
    }
}
