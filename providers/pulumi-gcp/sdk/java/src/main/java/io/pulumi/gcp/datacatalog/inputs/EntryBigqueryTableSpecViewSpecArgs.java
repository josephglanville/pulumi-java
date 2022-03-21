// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EntryBigqueryTableSpecViewSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final EntryBigqueryTableSpecViewSpecArgs Empty = new EntryBigqueryTableSpecViewSpecArgs();

    @Import(name="viewQuery")
      private final @Nullable Output<String> viewQuery;

    public Output<String> getViewQuery() {
        return this.viewQuery == null ? Output.empty() : this.viewQuery;
    }

    public EntryBigqueryTableSpecViewSpecArgs(@Nullable Output<String> viewQuery) {
        this.viewQuery = viewQuery;
    }

    private EntryBigqueryTableSpecViewSpecArgs() {
        this.viewQuery = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntryBigqueryTableSpecViewSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> viewQuery;

        public Builder() {
    	      // Empty
        }

        public Builder(EntryBigqueryTableSpecViewSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.viewQuery = defaults.viewQuery;
        }

        public Builder viewQuery(@Nullable Output<String> viewQuery) {
            this.viewQuery = viewQuery;
            return this;
        }
        public Builder viewQuery(@Nullable String viewQuery) {
            this.viewQuery = Output.ofNullable(viewQuery);
            return this;
        }        public EntryBigqueryTableSpecViewSpecArgs build() {
            return new EntryBigqueryTableSpecViewSpecArgs(viewQuery);
        }
    }
}
