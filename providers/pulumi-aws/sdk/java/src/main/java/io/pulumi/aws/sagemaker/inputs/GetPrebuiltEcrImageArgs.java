// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPrebuiltEcrImageArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPrebuiltEcrImageArgs Empty = new GetPrebuiltEcrImageArgs();

    /**
     * The DNS suffix to use in the registry path. If not specified, the AWS provider sets it to the DNS suffix for the current region.
     * 
     */
    @Import(name="dnsSuffix")
      private final @Nullable String dnsSuffix;

    public Optional<String> getDnsSuffix() {
        return this.dnsSuffix == null ? Optional.empty() : Optional.ofNullable(this.dnsSuffix);
    }

    /**
     * The image tag for the Docker image. If not specified, the AWS provider sets the value to `1`, which for many repositories indicates the latest version. Some repositories, such as XGBoost, do not support `1` or `latest` and specific version must be used.
     * 
     */
    @Import(name="imageTag")
      private final @Nullable String imageTag;

    public Optional<String> getImageTag() {
        return this.imageTag == null ? Optional.empty() : Optional.ofNullable(this.imageTag);
    }

    /**
     * The region to use in the registry path. If not specified, the AWS provider sets it to the current region.
     * 
     */
    @Import(name="region")
      private final @Nullable String region;

    public Optional<String> getRegion() {
        return this.region == null ? Optional.empty() : Optional.ofNullable(this.region);
    }

    /**
     * The name of the repository, which is generally the algorithm or library. Values include `blazingtext`, `factorization-machines`, `forecasting-deepar`, `image-classification`, `ipinsights`, `kmeans`, `knn`, `lda`, `linear-learner`, `mxnet-inference-eia`, `mxnet-inference`, `mxnet-training`, `ntm`, `object-detection`, `object2vec`, `pca`, `pytorch-inference-eia`, `pytorch-inference`, `pytorch-training`, `randomcutforest`, `sagemaker-scikit-learn`, `sagemaker-sparkml-serving`, `sagemaker-xgboost`, `semantic-segmentation`, `seq2seq`, `tensorflow-inference-eia`, `tensorflow-inference`, `tensorflow-training`, `huggingface-tensorflow-training`, `huggingface-tensorflow-inference`, `huggingface-pytorch-training`, and `huggingface-pytorch-inference`.
     * 
     */
    @Import(name="repositoryName", required=true)
      private final String repositoryName;

    public String getRepositoryName() {
        return this.repositoryName;
    }

    public GetPrebuiltEcrImageArgs(
        @Nullable String dnsSuffix,
        @Nullable String imageTag,
        @Nullable String region,
        String repositoryName) {
        this.dnsSuffix = dnsSuffix;
        this.imageTag = imageTag;
        this.region = region;
        this.repositoryName = Objects.requireNonNull(repositoryName, "expected parameter 'repositoryName' to be non-null");
    }

    private GetPrebuiltEcrImageArgs() {
        this.dnsSuffix = null;
        this.imageTag = null;
        this.region = null;
        this.repositoryName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrebuiltEcrImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dnsSuffix;
        private @Nullable String imageTag;
        private @Nullable String region;
        private String repositoryName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrebuiltEcrImageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsSuffix = defaults.dnsSuffix;
    	      this.imageTag = defaults.imageTag;
    	      this.region = defaults.region;
    	      this.repositoryName = defaults.repositoryName;
        }

        public Builder dnsSuffix(@Nullable String dnsSuffix) {
            this.dnsSuffix = dnsSuffix;
            return this;
        }
        public Builder imageTag(@Nullable String imageTag) {
            this.imageTag = imageTag;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        public Builder repositoryName(String repositoryName) {
            this.repositoryName = Objects.requireNonNull(repositoryName);
            return this;
        }        public GetPrebuiltEcrImageArgs build() {
            return new GetPrebuiltEcrImageArgs(dnsSuffix, imageTag, region, repositoryName);
        }
    }
}