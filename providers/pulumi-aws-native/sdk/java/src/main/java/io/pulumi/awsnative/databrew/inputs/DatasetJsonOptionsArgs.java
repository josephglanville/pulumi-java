// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Json options
 * 
 */
public final class DatasetJsonOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetJsonOptionsArgs Empty = new DatasetJsonOptionsArgs();

    @InputImport(name="multiLine")
      private final @Nullable Output<Boolean> multiLine;

    public Output<Boolean> getMultiLine() {
        return this.multiLine == null ? Output.empty() : this.multiLine;
    }

    public DatasetJsonOptionsArgs(@Nullable Output<Boolean> multiLine) {
        this.multiLine = multiLine;
    }

    private DatasetJsonOptionsArgs() {
        this.multiLine = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetJsonOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> multiLine;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetJsonOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.multiLine = defaults.multiLine;
        }

        public Builder multiLine(@Nullable Output<Boolean> multiLine) {
            this.multiLine = multiLine;
            return this;
        }

        public Builder multiLine(@Nullable Boolean multiLine) {
            this.multiLine = Output.ofNullable(multiLine);
            return this;
        }
        public DatasetJsonOptionsArgs build() {
            return new DatasetJsonOptionsArgs(multiLine);
        }
    }
}
