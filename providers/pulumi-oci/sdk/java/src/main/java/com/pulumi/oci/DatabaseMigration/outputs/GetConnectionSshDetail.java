// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DatabaseMigration.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetConnectionSshDetail {
    /**
     * @return Name of the host the SSH key is valid for.
     * 
     */
    private final String host;
    private final String sshkey;
    /**
     * @return Sudo location
     * 
     */
    private final String sudoLocation;
    /**
     * @return SSH user
     * 
     */
    private final String user;

    @CustomType.Constructor
    private GetConnectionSshDetail(
        @CustomType.Parameter("host") String host,
        @CustomType.Parameter("sshkey") String sshkey,
        @CustomType.Parameter("sudoLocation") String sudoLocation,
        @CustomType.Parameter("user") String user) {
        this.host = host;
        this.sshkey = sshkey;
        this.sudoLocation = sudoLocation;
        this.user = user;
    }

    /**
     * @return Name of the host the SSH key is valid for.
     * 
     */
    public String host() {
        return this.host;
    }
    public String sshkey() {
        return this.sshkey;
    }
    /**
     * @return Sudo location
     * 
     */
    public String sudoLocation() {
        return this.sudoLocation;
    }
    /**
     * @return SSH user
     * 
     */
    public String user() {
        return this.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionSshDetail defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String host;
        private String sshkey;
        private String sudoLocation;
        private String user;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConnectionSshDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.sshkey = defaults.sshkey;
    	      this.sudoLocation = defaults.sudoLocation;
    	      this.user = defaults.user;
        }

        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        public Builder sshkey(String sshkey) {
            this.sshkey = Objects.requireNonNull(sshkey);
            return this;
        }
        public Builder sudoLocation(String sudoLocation) {
            this.sudoLocation = Objects.requireNonNull(sudoLocation);
            return this;
        }
        public Builder user(String user) {
            this.user = Objects.requireNonNull(user);
            return this;
        }        public GetConnectionSshDetail build() {
            return new GetConnectionSshDetail(host, sshkey, sudoLocation, user);
        }
    }
}
