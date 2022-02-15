// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.forecast;

import io.pulumi.awsnative.forecast.enums.DatasetGroupDomain;
import io.pulumi.awsnative.forecast.inputs.DatasetGroupTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatasetGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetGroupArgs Empty = new DatasetGroupArgs();

    @InputImport(name="datasetArns")
    private final @Nullable Input<List<String>> datasetArns;

    public Input<List<String>> getDatasetArns() {
        return this.datasetArns == null ? Input.empty() : this.datasetArns;
    }

    @InputImport(name="datasetGroupName")
    private final @Nullable Input<String> datasetGroupName;

    public Input<String> getDatasetGroupName() {
        return this.datasetGroupName == null ? Input.empty() : this.datasetGroupName;
    }

    @InputImport(name="domain", required=true)
    private final Input<DatasetGroupDomain> domain;

    public Input<DatasetGroupDomain> getDomain() {
        return this.domain;
    }

    @InputImport(name="tags")
    private final @Nullable Input<List<DatasetGroupTagArgs>> tags;

    public Input<List<DatasetGroupTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public DatasetGroupArgs(
        @Nullable Input<List<String>> datasetArns,
        @Nullable Input<String> datasetGroupName,
        Input<DatasetGroupDomain> domain,
        @Nullable Input<List<DatasetGroupTagArgs>> tags) {
        this.datasetArns = datasetArns;
        this.datasetGroupName = datasetGroupName;
        this.domain = Objects.requireNonNull(domain, "expected parameter 'domain' to be non-null");
        this.tags = tags;
    }

    private DatasetGroupArgs() {
        this.datasetArns = Input.empty();
        this.datasetGroupName = Input.empty();
        this.domain = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> datasetArns;
        private @Nullable Input<String> datasetGroupName;
        private Input<DatasetGroupDomain> domain;
        private @Nullable Input<List<DatasetGroupTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetArns = defaults.datasetArns;
    	      this.datasetGroupName = defaults.datasetGroupName;
    	      this.domain = defaults.domain;
    	      this.tags = defaults.tags;
        }

        public Builder setDatasetArns(@Nullable Input<List<String>> datasetArns) {
            this.datasetArns = datasetArns;
            return this;
        }

        public Builder setDatasetArns(@Nullable List<String> datasetArns) {
            this.datasetArns = Input.ofNullable(datasetArns);
            return this;
        }

        public Builder setDatasetGroupName(@Nullable Input<String> datasetGroupName) {
            this.datasetGroupName = datasetGroupName;
            return this;
        }

        public Builder setDatasetGroupName(@Nullable String datasetGroupName) {
            this.datasetGroupName = Input.ofNullable(datasetGroupName);
            return this;
        }

        public Builder setDomain(Input<DatasetGroupDomain> domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }

        public Builder setDomain(DatasetGroupDomain domain) {
            this.domain = Input.of(Objects.requireNonNull(domain));
            return this;
        }

        public Builder setTags(@Nullable Input<List<DatasetGroupTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<DatasetGroupTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public DatasetGroupArgs build() {
            return new DatasetGroupArgs(datasetArns, datasetGroupName, domain, tags);
        }
    }
}