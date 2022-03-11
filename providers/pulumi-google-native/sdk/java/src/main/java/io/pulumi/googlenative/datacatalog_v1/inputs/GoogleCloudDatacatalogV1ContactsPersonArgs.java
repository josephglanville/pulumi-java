// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A contact person for the entry.
 * 
 */
public final class GoogleCloudDatacatalogV1ContactsPersonArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatacatalogV1ContactsPersonArgs Empty = new GoogleCloudDatacatalogV1ContactsPersonArgs();

    /**
     * Designation of the person, for example, Data Steward.
     * 
     */
    @InputImport(name="designation")
      private final @Nullable Output<String> designation;

    public Output<String> getDesignation() {
        return this.designation == null ? Output.empty() : this.designation;
    }

    /**
     * Email of the person in the format of `john.doe@xyz`, ``, or `John Doe`.
     * 
     */
    @InputImport(name="email")
      private final @Nullable Output<String> email;

    public Output<String> getEmail() {
        return this.email == null ? Output.empty() : this.email;
    }

    public GoogleCloudDatacatalogV1ContactsPersonArgs(
        @Nullable Output<String> designation,
        @Nullable Output<String> email) {
        this.designation = designation;
        this.email = email;
    }

    private GoogleCloudDatacatalogV1ContactsPersonArgs() {
        this.designation = Output.empty();
        this.email = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1ContactsPersonArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> designation;
        private @Nullable Output<String> email;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1ContactsPersonArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.designation = defaults.designation;
    	      this.email = defaults.email;
        }

        public Builder designation(@Nullable Output<String> designation) {
            this.designation = designation;
            return this;
        }

        public Builder designation(@Nullable String designation) {
            this.designation = Output.ofNullable(designation);
            return this;
        }

        public Builder email(@Nullable Output<String> email) {
            this.email = email;
            return this;
        }

        public Builder email(@Nullable String email) {
            this.email = Output.ofNullable(email);
            return this;
        }
        public GoogleCloudDatacatalogV1ContactsPersonArgs build() {
            return new GoogleCloudDatacatalogV1ContactsPersonArgs(designation, email);
        }
    }
}
