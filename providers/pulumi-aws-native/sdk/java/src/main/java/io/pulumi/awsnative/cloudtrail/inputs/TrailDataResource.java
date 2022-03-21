// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudtrail.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * CloudTrail supports data event logging for Amazon S3 objects and AWS Lambda functions. You can specify up to 250 resources for an individual event selector, but the total number of data resources cannot exceed 250 across all event selectors in a trail. This limit does not apply if you configure resource logging for all data events.
 * 
 */
public final class TrailDataResource extends io.pulumi.resources.InvokeArgs {

    public static final TrailDataResource Empty = new TrailDataResource();

    /**
     * The resource type in which you want to log data events. You can specify AWS::S3::Object or AWS::Lambda::Function resources.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * An array of Amazon Resource Name (ARN) strings or partial ARN strings for the specified objects.
     * 
     */
    @Import(name="values")
      private final @Nullable List<String> values;

    public List<String> getValues() {
        return this.values == null ? List.of() : this.values;
    }

    public TrailDataResource(
        String type,
        @Nullable List<String> values) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.values = values;
    }

    private TrailDataResource() {
        this.type = null;
        this.values = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrailDataResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;
        private @Nullable List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(TrailDataResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.values = defaults.values;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder values(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public TrailDataResource build() {
            return new TrailDataResource(type, values);
        }
    }
}
