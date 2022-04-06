// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelismGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelismGetArgs Empty = new ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelismGetArgs();

    /**
     * The number of in-application streams to create.
     * 
     */
    @Import(name="count")
      private final @Nullable Output<Integer> count;

    public Output<Integer> getCount() {
        return this.count == null ? Output.empty() : this.count;
    }

    public ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelismGetArgs(@Nullable Output<Integer> count) {
        this.count = count;
    }

    private ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelismGetArgs() {
        this.count = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelismGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> count;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelismGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
        }

        public Builder count(@Nullable Output<Integer> count) {
            this.count = count;
            return this;
        }
        public Builder count(@Nullable Integer count) {
            this.count = Output.ofNullable(count);
            return this;
        }        public ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelismGetArgs build() {
            return new ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelismGetArgs(count);
        }
    }
}