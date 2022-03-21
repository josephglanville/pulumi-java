// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties for plan on a custom image.
 * 
 */
public final class CustomImagePropertiesFromPlanArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomImagePropertiesFromPlanArgs Empty = new CustomImagePropertiesFromPlanArgs();

    /**
     * The id of the plan, equivalent to name of the plan
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * The offer for the plan from the marketplace image the custom image is derived from
     * 
     */
    @Import(name="offer")
      private final @Nullable Output<String> offer;

    public Output<String> getOffer() {
        return this.offer == null ? Output.empty() : this.offer;
    }

    /**
     * The publisher for the plan from the marketplace image the custom image is derived from
     * 
     */
    @Import(name="publisher")
      private final @Nullable Output<String> publisher;

    public Output<String> getPublisher() {
        return this.publisher == null ? Output.empty() : this.publisher;
    }

    public CustomImagePropertiesFromPlanArgs(
        @Nullable Output<String> id,
        @Nullable Output<String> offer,
        @Nullable Output<String> publisher) {
        this.id = id;
        this.offer = offer;
        this.publisher = publisher;
    }

    private CustomImagePropertiesFromPlanArgs() {
        this.id = Output.empty();
        this.offer = Output.empty();
        this.publisher = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomImagePropertiesFromPlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> id;
        private @Nullable Output<String> offer;
        private @Nullable Output<String> publisher;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomImagePropertiesFromPlanArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.offer = defaults.offer;
    	      this.publisher = defaults.publisher;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }
        public Builder offer(@Nullable Output<String> offer) {
            this.offer = offer;
            return this;
        }
        public Builder offer(@Nullable String offer) {
            this.offer = Output.ofNullable(offer);
            return this;
        }
        public Builder publisher(@Nullable Output<String> publisher) {
            this.publisher = publisher;
            return this;
        }
        public Builder publisher(@Nullable String publisher) {
            this.publisher = Output.ofNullable(publisher);
            return this;
        }        public CustomImagePropertiesFromPlanArgs build() {
            return new CustomImagePropertiesFromPlanArgs(id, offer, publisher);
        }
    }
}
