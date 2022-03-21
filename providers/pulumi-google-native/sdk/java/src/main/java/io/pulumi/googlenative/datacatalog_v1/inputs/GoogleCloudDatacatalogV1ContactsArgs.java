// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.datacatalog_v1.inputs.GoogleCloudDatacatalogV1ContactsPersonArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contact people for the entry.
 * 
 */
public final class GoogleCloudDatacatalogV1ContactsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatacatalogV1ContactsArgs Empty = new GoogleCloudDatacatalogV1ContactsArgs();

    /**
     * The list of contact people for the entry.
     * 
     */
    @Import(name="people")
      private final @Nullable Output<List<GoogleCloudDatacatalogV1ContactsPersonArgs>> people;

    public Output<List<GoogleCloudDatacatalogV1ContactsPersonArgs>> getPeople() {
        return this.people == null ? Output.empty() : this.people;
    }

    public GoogleCloudDatacatalogV1ContactsArgs(@Nullable Output<List<GoogleCloudDatacatalogV1ContactsPersonArgs>> people) {
        this.people = people;
    }

    private GoogleCloudDatacatalogV1ContactsArgs() {
        this.people = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1ContactsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<GoogleCloudDatacatalogV1ContactsPersonArgs>> people;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1ContactsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.people = defaults.people;
        }

        public Builder people(@Nullable Output<List<GoogleCloudDatacatalogV1ContactsPersonArgs>> people) {
            this.people = people;
            return this;
        }
        public Builder people(@Nullable List<GoogleCloudDatacatalogV1ContactsPersonArgs> people) {
            this.people = Output.ofNullable(people);
            return this;
        }
        public Builder people(GoogleCloudDatacatalogV1ContactsPersonArgs... people) {
            return people(List.of(people));
        }        public GoogleCloudDatacatalogV1ContactsArgs build() {
            return new GoogleCloudDatacatalogV1ContactsArgs(people);
        }
    }
}
